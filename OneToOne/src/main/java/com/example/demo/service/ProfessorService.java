package com.example.demo.service;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Professor;
import com.example.demo.repostiory.CoursesRepository;
import com.example.demo.repostiory.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;


    public List<Professor> getAllProfessors() {
        List<Professor> professor=professorRepository.findAll();
        return professor;
    }
    

    public Professor insertprofessors(Professor professor) {

        return professorRepository.save(professor);
    }




    public boolean deleteProfessor(Long professorId) {
        Professor professor=professorRepository.findById(professorId).get();

        try{
            professorRepository.delete(professor);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    public Professor getProfessors(Long professorId) {
        Professor pro=professorRepository.findById(professorId).get();
        return pro;
    }
}
