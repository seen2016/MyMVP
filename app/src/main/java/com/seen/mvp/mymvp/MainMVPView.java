package com.seen.mvp.mymvp;


import com.seen.mvp.mymvplib.base.IMVPView;
import com.seen.mvp.mymvplib.bean.ArticleBean;

import java.util.List;

/**
 * Created by seen on 2018/8/18.
 */

public interface MainMVPView extends IMVPView {

    void getDataSuccess(List<ArticleBean> articleList);
    void getDataFail(String failMsg);
}
