package com.studentTest.service;

import com.studentTest.bean.User;
import com.studentTest.dao.FileDao;
import com.studentTest.dao.FileDaoImpl;

import java.util.ArrayList;

public class FileServiceImpl implements FileService{
    FileDao fs=new FileDaoImpl();
    @Override
    public ArrayList<User> getAllStudent() {
        /*
        访问持久层
         */
        return fs.getAllStudent();
    }

    @Override
    public User getFileByNameOrId(String v) {
        return fs.getFileByNameOrId(v);
    }

    @Override
    public User getAdmine(String id) {
        return fs.getAdmine(id);
    }
}
