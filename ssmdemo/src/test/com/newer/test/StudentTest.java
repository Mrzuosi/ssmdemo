package com.newer.test;

import com.newer.pojo.Student;
import com.newer.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class StudentTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = context.getBean("studentService",StudentService.class);

        List<Student> list = studentService.findAll();

        System.out.println(list.size());
    }
}
