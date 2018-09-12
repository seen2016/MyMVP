package com.seen.mvp.mymvp;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.seen.mvp.mymvplib.base.BaseMVPView;
import com.seen.mvp.mymvplib.bean.ArticleBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseMVPView<MainActivityPresenter> implements MainMVPView {
    private static final String APP_KEY = "dbb6893ab0913b02724696504181fe39";
    @BindView(R.id.tv_text1)
    TextView tvText1;
    @BindView(R.id.tv_text2)
    TextView tvText2;
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
//        mDialog.show();
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
        tvText1.setText("属性动画");
        tvText2.setText("View动画");
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
        /*LayoutInflater from = LayoutInflater.from(this);
        View inflate = from.inflate(R.layout.activity_main, null, false);
*/
        return R.layout.activity_main;
    }

    @Override
    public void getDataSuccess(List<ArticleBean> articleList) {

    }

    @Override
    public void getDataFail(String failMsg) {
        Toast.makeText(this, failMsg, Toast.LENGTH_LONG).show();
    }

    @Override
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
        if (null != mDialog && mDialog.isShowing()) {
            mDialog.hide();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        initView();
        initListener();
        initData();
        initEnableView();
    }

    int position = 0;
    float x1 = 0f;
    float x2 = 300f;

    @OnClick({R.id.tv_text1, R.id.tv_text2})
    public void onViewClicked(final View view) {
        switch (view.getId()) {
            case R.id.tv_text1:
                //属性动画
                /*position += 100;
                view.setTranslationX(position);
                view.setAlpha((float) Math.random());*/

                /*ObjectAnimator oa = ObjectAnimator.ofFloat(view, "translationX", x1, x2);
                oa.setDuration(500);
                oa.start();
                x1=x2;
                x2+=x2;*/
//		ObjectAnimator oa = ObjectAnimator.ofFloat(v, "translationY", 0f,300f);
//		oa.setDuration(500);
//		oa.start();
//		ObjectAnimator oa = ObjectAnimator.ofFloat(v, "rotationX", 0f,360f);
//		oa.setDuration(500);
//		oa.start();

                //2.----------------多个动画同时执行---办法1：设置动画监听，开始第一个动画同时开启其他动画-----------------
                //方法1：
                ObjectAnimator animator = ObjectAnimator.ofFloat(view, "rotationX", 0f, 100f);//没有这个属性的时候，就是valueanimator
                animator.setDuration(300);
                //设置动画监听
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        //动画在执行的过程当中，不断地调用此方法
                        animation.getAnimatedFraction();//百分比
                        //得到duration时间内 values当中的某一个中间值。0f~100f
                        float value = (float) animation.getAnimatedValue();//
                        view.setScaleX(0.5f + value / 200);//0.5~1
                        view.setScaleY(0.5f + value / 200);//0.5~1
                    }
                });
                animator.start();

                break;
            case R.id.tv_text2:
                break;
        }
    }
}
