package com.haxi.mvp.model;

import java.util.List;

/**
 * Created by Han on 2018/8/10
 * Email:yin13753884368@163.com
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/yin13753884368
 */
public interface IStudentModel {
    void loadStudent(StudentOnLoad studentOnLoadListener);

    void onClick(StudentOnLoad studentOnLoadListener);

    class StudentOnLoad implements StudentOnLoadListener {

        @Override
        public void onComplete(List students) {

        }

        @Override
        public void onClick(int size) {

        }
    }

}
