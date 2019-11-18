package com.example.springbootswagger2.service.impl;

import com.example.springbootswagger2.mapper.StudentMapper;
import com.example.springbootswagger2.model.Student;
import com.example.springbootswagger2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;
    @Override
    public Student getStudent(String id) {
        return mapper.queryUserById(Integer.parseInt(id));
    }

    @Override
    public List<Student> getStudents() {
        return mapper.getStudents();
    }

    @Override
    public Student getStudentByName(String name) {
        return mapper.getStudentByName(name);
    }
}
