package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController

public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }


    @PostMapping("/authors")
    public Author insertCourse(@RequestBody Author author){
        return authorService.insertAuthors(author);
    }
/*
    @PutMapping("/course")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

 */

    @DeleteMapping("/authors/{id}")
    public String deletecoursebyid(@PathVariable("id") Long id){
        String message=authorService.deleteauthorsbyid(id);
        return message;

    }
}
