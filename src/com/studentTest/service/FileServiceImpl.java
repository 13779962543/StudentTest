package com.studentTest.service;

import com.studentTest.bean.User;
import com.studentTest.dao.FileDao;
import com.studentTest.dao.FileDaoImpl;

import java.util.ArrayList;

public class FileServiceImpl implements FileService{
    @Override
    public ArrayList<User> getAllStudent() {
        /*
        访问持久层
         */
        FileDao fs=new FileDaoImpl();
        return fs.getAllStudent();
    }
}
