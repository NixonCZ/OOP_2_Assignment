package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    private final StudentService stdservice;

    @Autowired
    public StudentController(StudentService stdservice){
        this.stdservice = stdservice;
    }

    @RequestMapping(value = "/ViewList",method = RequestMethod.GET)
    public ResponseEntity<List<Student>> studentList(){
        return new ResponseEntity<>(stdservice.getAllStudents(),HttpStatus.OK);
    }

    @PostMapping(value = "/save")
    public String saveStu(@RequestBody Student std){
        stdservice.saveStudent(std);
        return "Saved Data .......";
    }


}