package com.newer.dao;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    @Insert("insert into stuinfo(stuname,stusex,stucard,stujointime,stuaddress," +
            "sclassid) values(#{stuName},#{stuSex},#{stuCard,jdbcType=VARCHAR},#{stuJoinTime,jdbcType=DATE},#{stuAddress,jdbcType=VARCHAR}," +
            "#{sclassid,jdbcType=INTEGER})")
    int addStudent(Student student);

    @Delete("delete from stuinfo where stuid=#{stuId}")
    int deleteStudent(@Param("stuId") int stuId);

    @Select("select * from stuinfo where stuid=#{stuId}")
    Student findById(@Param("stuId") int stuId);

    @Select("select * from stuinfo")
    List<Student> findAll();
}
