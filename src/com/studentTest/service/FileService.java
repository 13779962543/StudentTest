package com.studentTest.service;

import com.studentTest.bean.Major;
import com.studentTest.bean.User;

import java.util.ArrayList;

public interface FileService {
    ArrayList<User> getAllStudent();

    User getFileByNameOrId(String v);

    User getAdmine(String id);

    ArrayList getPersonFile(String studentId);
}
