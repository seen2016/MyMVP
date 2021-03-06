package com.seen.mvp.mymvplib.base;

/**
 * Created by seen on 2018/8/18.
 */

public interface IPresenter<V extends IMVPView> {
    void attach(V view);

    void detach();
}
