package com.example.demo.service;

import com.example.demo.entity.Professor;
import com.example.demo.entity.Subject;
import com.example.demo.repostiory.ProfessorRepository;
import com.example.demo.repostiory.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SubjectService {
    @Autowired
    SubjectsRepository subjectsRepository;

    @Autowired
    ProfessorRepository professorRepository;

    public List<Subject> getallsubjects() {
        List<Subject> subject = subjectsRepository.findAll();
        return subject;

    }

    public Subject insertSubject(Subject subject) {
        return subjectsRepository.save(subject);

    }

    public boolean deleteSubject(Long id) {
        Subject subject = subjectsRepository.findById(id).get();

        try {
            subjectsRepository.delete(subject);
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public String addsubjectstoprofessor(long subject_id, long professor_id) {


        try {
            Professor professor = professorRepository.findById(professor_id).get();
            try {
                Subject subject = subjectsRepository.findById(subject_id).get();
                subject.addprofessor(professor);
                professor.addsubject(subject);
               subjectsRepository.save(subject);
                professorRepository.save(professor);
                return "done";

            } catch (Exception ex) {
                return "not possible no subject found";
            }
        }
        catch (Exception ex) {
            return "not possible no professor found";
        }
    }
}


