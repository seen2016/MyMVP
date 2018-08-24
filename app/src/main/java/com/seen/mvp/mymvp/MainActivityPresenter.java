package com.seen.mvp.mymvp;

import com.seen.mvp.mymvplib.base.BaseMVPPresenter;
import com.seen.mvp.mymvplib.bean.BaseResponse;
import com.seen.mvp.mymvplib.bean.DetailTaskResultEntity;
import com.seen.mvp.mymvplib.mode.DataModel;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by seen on 2018/8/18.
 */

public class MainActivityPresenter extends BaseMVPPresenter<MainMVPView> {
    private DataModel mModel;

    public MainActivityPresenter() {
        this.mModel = new DataModel();
    }

    void getData(String key) {
            mView.showLoding();
/*        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        mModel.getData(key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(BaseResponse baseResponse) {
                   /*     ResponseData result = baseResponse.getResult();
                        List<ArticleBean> list = result.getList();
                        mView.getDataSuccess(list);*/
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        mView.hideLogding();
                        mView.getDataFail("请求失败");
                    }

                    @Override
                    public void onComplete() {
                        mView.hideLogding();
                    }
                });

    }

    void queryTaskDetail(String key) {
        mView.showLoding();
        mModel.queryTaskDetail(key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DetailTaskResultEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DetailTaskResultEntity detailTaskResultEntity) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
