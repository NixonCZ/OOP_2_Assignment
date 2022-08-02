package com.example.demo.Service.Imp;
import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository stdRepository;


    @Override
    public List<Student> getAllStudents(){

        return stdRepository.findAll();
    }
    @Override
    public void saveStudent(Student s){

        stdRepository.save(s);

    }
}
