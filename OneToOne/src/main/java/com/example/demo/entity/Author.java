package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Author {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private int age;
    private String address;

    @OneToMany(mappedBy = "author")

    private List<Book> book=new ArrayList<>();
}
