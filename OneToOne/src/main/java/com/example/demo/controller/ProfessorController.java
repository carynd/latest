package com.example.demo.controller;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Professor;
import com.example.demo.service.CoursesService;
import com.example.demo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    @Autowired
    ProfessorService professorService;


    @GetMapping("/professors")
    public List<Professor> getAllProfessors(){
        return professorService.getAllProfessors();
    }
    @GetMapping("/professors/{id}")
    public Professor getProfessors(@PathVariable("id") Long professorId){
        return professorService.getProfessors(professorId);
    }

    @PostMapping("/professors")
    public Professor insertprofessors(@RequestBody Professor professor){
        return professorService.insertprofessors(professor);
    }
    /*
    @PutMapping("/professors")
    public Professor updateProfessor(@RequestBody Professor professor){
        return professorService.updateProfessor(professor);
    }

     */

    @DeleteMapping("/professors/{id}")
    public String deleteCourses(@PathVariable("id") Long professorId){

        boolean flag = professorService.deleteProfessor(professorId);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }
}
