package com.seen.mvp.mymvplib.mode;

import com.seen.mvp.mymvplib.bean.BaseResponse;

import io.reactivex.Observable;

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

}