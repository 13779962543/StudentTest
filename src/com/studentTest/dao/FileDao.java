package com.studentTest.dao;

import com.studentTest.bean.Major;
import com.studentTest.bean.User;

import java.util.ArrayList;

public interface FileDao {
    ArrayList<User> getAllStudent();

    User getFileByNameOrId(String v);

    User getAdmine(String id);

    ArrayList getPersonFile(String studentId);

    void del(String stu);

    void upScore(String stuId, String a, String b, String c, String d);
}
