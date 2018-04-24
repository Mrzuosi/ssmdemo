package com.newer.service;

import com.newer.pojo.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);

    int deleteStudent(int stuId);

    Student findById(int stuId);

    List<Student> findAll();
}
