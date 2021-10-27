package com.example.demo.service;

import com.example.demo.entity.Courses;
import com.example.demo.repostiory.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public List<Courses> getAllCourses() {
        List<Courses> course=coursesRepository.findAll();
        return course;
    }

    public Courses insertCourses(Courses course) {
        return coursesRepository.save(course);
    }
}
