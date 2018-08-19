package com.seen.mvp.mymvp;

import android.app.ProgressDialog;

import com.seen.mvp.mymvplib.base.BaseMVPView;
import com.seen.mvp.mymvplib.bean.ArticleBean;

import java.util.List;

public class MainActivity extends BaseMVPView<MainActivityPresenter> implements MainMVPView{
    private static final String APP_KEY = "dbb6893ab0913b02724696504181fe39";
    private ProgressDialog myDialog;
    /**
     * 控件是否可点击
     */
    @Override
    protected void initEnableView() {

    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        mDialog.show();
        mPresenter.getData(APP_KEY);
    }

    /**
     * 初始化监听
     */
    @Override
    protected void initListener() {

    }

    /**
     * 初始化 view
     */
    @Override
    protected void initView() {
        mDialog = new ProgressDialog(this);
        mDialog.setMessage("MainActivity页面玩命加载中...");
    }

    /**
     * 创建相应的P
     *
     * @return 返回相应 的P
     */
    @Override
    protected MainActivityPresenter createPresenter() {
        return new MainActivityPresenter();
    }


    /**
     * 获取 布局ID
     *
     * @return
     */
    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getDataSuccess(List<ArticleBean> articleList) {

    }

    @Override
    public void getDataFail(String failMsg) {

    }



/*    @Override
    public void showLoding() {
        if (null == mDialog) {
            mDialog = new ProgressDialog(this);
            mDialog.setMessage("MainActivity页面玩命加载中...");
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
    }*/
}
