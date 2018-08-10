package com.haxi.mvp.presenter;

import com.haxi.mvp.model.IStudentModel;
import com.haxi.mvp.model.StudentModelImp;
import com.haxi.mvp.view.IMainView;

import java.util.List;

/**
 * Created by Han on 2018/8/9
 * Email:yin13753884368@163.com
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/yin13753884368
 */
public class MainPresenter {
    IStudentModel iStudentModel = new StudentModelImp();
    IMainView iMainView;

    public MainPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
    }

    public void fetch() {
        iMainView.showLoading();
        if (iStudentModel != null) {
            iStudentModel.loadStudent(new IStudentModel.StudentOnLoad() {
                @Override
                public void onComplete(List students) {
                    iMainView.showMainView(students);
                }
            });
        }
    }

    public void click() {
        if (iStudentModel != null) {
            iStudentModel.onClick(new IStudentModel.StudentOnLoad() {
                @Override
                public void onClick(int size) {
                    iMainView.showOnClick(size);
                }
            });
        }
    }
}
