package com.example.demo.controller;

import com.example.demo.entity.passport;
import com.example.demo.entity.student;
import com.example.demo.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class studentcontroller {

    @Autowired
    studentservice studentService;


    @GetMapping("/students")
    public List<student> getAllStudents(){
        List<student> bookInfo = studentService.getAllStudents();
        return bookInfo;
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable long del_id){
        String ans= studentService.deleteStudent(del_id);
        return ans;
    }
}
