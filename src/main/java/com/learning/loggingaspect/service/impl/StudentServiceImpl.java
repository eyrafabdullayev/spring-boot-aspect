package com.learning.loggingaspect.service.impl;

import com.learning.loggingaspect.bean.Student;
import com.learning.loggingaspect.dao.inter.StudentDaoInter;
import com.learning.loggingaspect.service.inter.StudentServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServiceInter {

    @Autowired
    @Qualifier("studentDao")
    StudentDaoInter studentDao;

    @Override
    public Student getStudent() {
        return studentDao.getStudent();
    }
}
