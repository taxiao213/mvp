package com.haxi.mvp.ui;

import android.view.View;
import android.widget.TextView;

import com.haxi.mvp.R;
import com.haxi.mvp.base.BaseActvity;
import com.haxi.mvp.presenter.MainPresenter;
import com.haxi.mvp.view.IMainView;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActvity implements IMainView {


    @BindView(R.id.tv)
    TextView tv;
    private MainPresenter presenter;

    @Override
    protected int initView() {
        return R.layout.activity_main;
    }

    @Override
    protected void setData() {
        presenter = new MainPresenter(this);
        presenter.fetch();
    }


    @OnClick(R.id.tv)
    public void onClicked() {
        if (presenter != null) {
            presenter.click();
        }
    }

    public void onclick() {

    }

    @Override
    public void showLoading() {
        tv.setVisibility(View.GONE);
    }

    @Override
    public void showMainView(List students) {
        tv.setVisibility(View.VISIBLE);
        tv.setText(students.size() + "");
    }

    @Override
    public void showOnClick(int size) {
        tv.setText(size + "");
    }


}
