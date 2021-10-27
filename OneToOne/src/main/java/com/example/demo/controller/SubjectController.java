package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.Professor;
import com.example.demo.entity.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {


    @Autowired
    SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getallsubjects(){
      return subjectService.getallsubjects();

    }

    @PostMapping("/subjects")
    public Subject insertSubject(@RequestBody Subject subject){
      return subjectService.insertSubject(subject);
    }
    @DeleteMapping("subjects/{id}")
    public String deleteSubject(@PathVariable("id") Long id){
        boolean flag = subjectService.deleteSubject(id);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";

    }
    @PostMapping("/subjects/{sid}/professors/{pid}")
    public String addbookstoauthor(@PathVariable("sid") long subject_id, @PathVariable("pid") long professor_id){
        return subjectService.addsubjectstoprofessor(subject_id,professor_id);
    }

}
