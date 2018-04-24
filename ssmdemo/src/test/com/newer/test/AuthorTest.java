package com.newer.test;

import com.newer.pojo.Author;
import com.newer.service.AuthorService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AuthorTest {

    @Test
    public  void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AuthorService authorService = context.getBean("authorService",AuthorService.class);

        List<Author> list = authorService.findAll();

        System.out.println(list.size());
        for (Author author:
             list) {
            System.out.println(author.getName());
        }
    }
}
