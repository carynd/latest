package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.repostiory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author insertAuthors(Author author) {
        return authorRepository.save(author);
    }

    public String deleteauthorsbyid(Long id) {
        Author author = authorRepository.findById(id).get();

        try{
            authorRepository.delete(author);
            return "true";
        }
        catch (Exception ex){
            return "false";
        }
    }
}
