package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        List<Book> bookInfo = bookService.getAllBooks();
        return bookInfo;
    }
    //    @GetMapping("/rev")
//    public List<Review> getReviews(){
//        return reviewsService.getReviews();
//
//    }
    @PostMapping("/books/authors/{id}")
    public String addbookstoauthor(@PathVariable("id") long id, @RequestBody List<Book> book ){
        return bookService.addbookstoauthor( book,id);
    }






    @PutMapping("/books")
    public Book updatebooks(@RequestBody Book book){
        return  bookService.updatebooks(book);
    }

    @DeleteMapping("/books/{id}")
    public String deletebook(@PathVariable("id") Long Id){

        boolean flag = bookService.deletebook(Id);
        if(flag) return "Entry Deleted";
        else return "Fail to Delete";
    }
}
