package com.seen.mvp.mymvplib.mode;

import com.seen.mvp.mymvplib.bean.BaseResponse;
import com.seen.mvp.mymvplib.bean.DUResult;
import com.seen.mvp.mymvplib.bean.DetailTaskResultEntity;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * model 层：从数据源（网络、数据库）获取数据
 */
public class DataModel {

    private DataApi mApi;

    public DataModel() {
        mApi = RetrofitHelpter.createApi(DataApi.class);
    }

    public Observable<BaseResponse> getData(String appKey) {
        return mApi.getData(appKey);
    }


    public Observable<DetailTaskResultEntity> queryTaskDetail(String appKey) {
        return mApi.queryTaskDetail(appKey)
                .concatMap(new Function<DUResult<List<DetailTaskResultEntity>>, ObservableSource<? extends DetailTaskResultEntity>>() {
                    @Override
                    public ObservableSource<? extends DetailTaskResultEntity> apply(DUResult<List<DetailTaskResultEntity>> listDUResult) throws Exception {
                        List<DetailTaskResultEntity> data = listDUResult.getData();
                        return Observable.fromIterable(data);
                    }
                });
/*                .map(new Function<DUResult<List<DetailTaskResultEntity>>, List<DetailTaskResultEntity>>() {
                    @Override
                    public List<DetailTaskResultEntity> apply(DUResult<List<DetailTaskResultEntity>> listDUResult) throws Exception {
                        int statusCode = listDUResult.getStatusCode();
                        List<DetailTaskResultEntity> data = listDUResult.getData();
                        return data;
                    }
                })
                .concatMap(new Function<List<DetailTaskResultEntity>, ObservableSource<DetailTaskResultEntity>>() {
                    @Override
                    public ObservableSource<DetailTaskResultEntity> apply(List<DetailTaskResultEntity> detailTaskResultEntities) throws Exception {
                        return Observable.fromIterable(detailTaskResultEntities);
                    }
                });*/

    }

}