package com.seen.mvp.mymvplib.mode;


import com.seen.mvp.mymvplib.bean.BaseResponse;
import com.seen.mvp.mymvplib.bean.DUResult;
import com.seen.mvp.mymvplib.bean.DetailTaskResultEntity;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataApi {

    @GET("/weixin/query")
    Observable<BaseResponse> getData(@Query("key") String appKey);


    @GET("api/wap/v1/mobile/tasks/detail?")
    Observable<DUResult<List<DetailTaskResultEntity>>> queryTaskDetail(@Query("taskId") String taskId);



}