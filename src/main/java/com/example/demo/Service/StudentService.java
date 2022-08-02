package com.example.demo.Service;

import com.example.demo.Model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    void saveStudent(Student s);

}