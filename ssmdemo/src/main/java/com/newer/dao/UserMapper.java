package com.newer.dao;

import com.newer.pojo.Student;
import com.newer.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Insert("insert into user (username,password) values (#{userName},#{password})")
    int addUser(User user);

    @Select("select * from user")
    List<User>findAll1();


}
