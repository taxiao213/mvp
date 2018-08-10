package com.haxi.mvp.view;

import java.util.List;

/**
 * Created by Han on 2018/8/9
 * Email:yin13753884368@163.com
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/yin13753884368
 */
public interface IMainView {
    void showLoading();

    void showMainView(List students);

    void showOnClick(int size);
}
