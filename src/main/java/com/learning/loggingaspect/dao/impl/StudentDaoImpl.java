package com.learning.loggingaspect.dao.impl;

import com.learning.loggingaspect.bean.Student;
import com.learning.loggingaspect.dao.inter.StudentDaoInter;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDaoInter {

    @Override
    public Student getStudent() {
        return new Student("James",50);
    }
}
