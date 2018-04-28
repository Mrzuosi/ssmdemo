package com.newer.service;

import com.newer.dao.StudentMapper;
import com.newer.dao.UserMapper;
import com.newer.pojo.Student;
import com.newer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("studentService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation=Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Transactional(propagation=Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int deleteStudent(int stuId) {
        return studentMapper.deleteStudent(stuId);
    }

    @Override
    public Student findById(int stuId) {
        return studentMapper.findById(stuId);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public List<Student> findAll2() {
        return studentMapper.findAll2();
    }

    @Override
    public List<User> findAll1() {
        return userMapper.findAll1();
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
