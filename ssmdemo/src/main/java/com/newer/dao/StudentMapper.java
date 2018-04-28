package com.newer.dao;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    @Insert("insert into stuinfo(stuname,stusex,stucard,stujointime,stuaddress) " +
            "values(#{stuName},#{stuSex}," +
            "#{stuCard,jdbcType=VARCHAR},#{stuJoinTime,jdbcType=DATE},#{stuAddress,jdbcType=VARCHAR})")
    int addStudent(Student student);

    @Delete("delete from stuinfo where stuid=#{stuId}")
    int deleteStudent(@Param("stuId") int stuId);

    @Select("select * from stuinfo where stuid=#{stuId}")
    Student findById(@Param("stuId") int stuId);

    @Select("select * from stuinfo")
    List<Student>findAll();

    @ResultMap(value = "com.newer.dao.StudentMapper.stuList1")
    @Select("select stuid,stuname,stusex,stujointime,classid,classname from stuinfo s left join classinfo c on s.sclassid=c.classid")
    List<Student>findAll2();

    @ResultMap(value = "com.newer.dao.StuudentMapper.updateStudent")
    int updateStudent(Student student);
}
