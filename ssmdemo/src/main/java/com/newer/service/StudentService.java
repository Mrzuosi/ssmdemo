package com.newer.service;

import com.newer.pojo.Student;
import com.newer.pojo.User;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    int deleteStudent(int stuId);

    Student findById(int stuId);

    int updateStudent(Student student);

    List<Student> findAll();

    List<Student> findAll2();

    List<User>findAll1();

    int addUser(User user);

}
