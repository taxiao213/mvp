package com.haxi.mvp.model;

import com.haxi.mvp.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Han on 2018/8/10
 * Email:yin13753884368@163.com
 * CSDN:http://blog.csdn.net/yin13753884368/article
 * Github:https://github.com/yin13753884368
 */
public class StudentModelImp implements IStudentModel {
    int size = 10;
    @Override
    public void loadStudent(StudentOnLoad studentOnLoadListener) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("111"));
        list.add(new Student("222"));
        if (studentOnLoadListener != null) {
            studentOnLoadListener.onComplete(list);
        }
    }

    @Override
    public void onClick(StudentOnLoad studentOnLoadListener) {

        if (studentOnLoadListener != null) {
            studentOnLoadListener.onClick(size++);
        }
    }
}
