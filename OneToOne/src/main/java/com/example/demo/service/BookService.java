package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repostiory.AuthorRepository;
import com.example.demo.repostiory.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        List<Book> books = booksRepository.findAll();
        return books;
    }

    public String addbookstoauthor(List<Book> book, long id) {
        try {
            Author author=authorRepository.findById(id).get();

            for(Book r :book) {
                r.setAuthor(author);
                booksRepository.save(r);
            }
            return "saved";


        } catch (Exception e) {
            return "error";
        }

    }

    public boolean deletebook(Long Id) {
       Book book = booksRepository.findById(Id).get();

        try{
            booksRepository.delete(book);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }

    public Book updatebooks(Book book) {
       Book book1 = booksRepository.findById(book.getId()).get();
        //  review1.setRating(review.getRating());
        book1.setDescription(book1.getDescription());
        booksRepository.save(book1);

        return book1;

    }


}
