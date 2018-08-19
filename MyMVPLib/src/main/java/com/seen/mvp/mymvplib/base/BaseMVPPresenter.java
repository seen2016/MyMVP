package com.seen.mvp.mymvplib.base;

/**
 * Created by seen on 2018/8/18.
 */

public abstract class BaseMVPPresenter<V extends IMVPView> implements IPresenter<V> {
    public V mView;
    @Override
    public void attach(V view) {
        this.mView=view;
    }

    @Override
    public void detach() {
        this.mView=null;
    }
}
