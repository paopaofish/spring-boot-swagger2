package com.example.springbootswagger2.mapper;

import com.example.springbootswagger2.model.Student;
import com.example.springbootswagger2.type.MyTypeHandler;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {
    @Select(value = "select className,studentName,country from studentInfo where id = #{id}")
    @Results({
            @Result(property = "cls",column = "className",javaType = String.class),
            @Result(property = "name",column = "studentName"),
    })
    Student queryUserById(@Param(value = "id") int id);

    @Select(value = "select * from studentInfo")
    @Results({
            @Result(property = "cls",column = "className",javaType = String.class),
            @Result(property = "name",column = "studentName"),
    })
    List<Student> getStudents();

    @Select(value = "select * from studentInfo where studentName = #{name}")
    @Results({
            @Result(property = "id",column = "id", javaType = Long.class,typeHandler = MyTypeHandler.class),
            @Result(property = "cls",column = "className",javaType = String.class),
            @Result(property = "name",column = "studentName"),
    })
    Student getStudentByName(String name);
}