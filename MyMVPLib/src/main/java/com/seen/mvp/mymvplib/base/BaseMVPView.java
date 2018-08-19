package com.seen.mvp.mymvplib.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by seen on 2018/8/18.
 */

public abstract class BaseMVPView<P extends IPresenter> extends AppCompatActivity implements IMVPView {
    public ProgressDialog mDialog;
    protected P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1 抽象出布局 layoutID方法
        setContentView(getLayoutID());
        //2 获取 相应的 presenter
        mPresenter = createPresenter();
        //3 判断  presenter 是否为空 是就抛出异常，否是绑定 相应的activity
        if (null == mPresenter) {
            throw new IllegalStateException("Please call mPresenter in BaseMVPActivity(createPresenter) to create!");
        }
        mPresenter.attach(this);

        //4 初始化 相应的view 数据 监听事件  是否可点击
        mDialog = new ProgressDialog(this);
        mDialog.setMessage("玩命加载中...");
        initView();
        initListener();
        initData();
        initEnableView();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDialog!=null)
        {
            mDialog.dismiss();
        }
        if (null != mPresenter) {
            mPresenter.detach();
        }


    }

    /**
     * 控件是否可点击
     */
    protected abstract void initEnableView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 初始化 view
     */
    protected abstract void initView();

    /**
     * 创建相应的P
     *
     * @return 返回相应 的P
     */
    protected abstract P createPresenter();

    /**
     * 获取 布局ID
     *
     * @return
     */
    protected abstract int getLayoutID();

    @Override
    public void showLoding() {
        if (null == mDialog) {
            mDialog = new ProgressDialog(this);
            mDialog.setMessage("玩命加载中...");
        }
        if (!mDialog.isShowing()) {
            mDialog.show();
        }
    }

    @Override
    public void hideLogding() {
        if (null!=mDialog&&mDialog.isShowing())
        {
            mDialog.hide();
        }
    }
}
