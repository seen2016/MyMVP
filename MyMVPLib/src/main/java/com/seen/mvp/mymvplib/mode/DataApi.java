package com.seen.mvp.mymvplib.mode;


import com.seen.mvp.mymvplib.bean.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataApi {

    @GET("/weixin/query")
    Observable<BaseResponse> getData(@Query("key") String appKey);

}