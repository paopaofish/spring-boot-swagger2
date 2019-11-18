package com.example.springbootswagger2.service;

import com.example.springbootswagger2.model.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentService {
    Student getStudent(String id);

    List<Student> getStudents();

    Student getStudentByName(String name);
}
