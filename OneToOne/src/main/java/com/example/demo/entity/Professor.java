package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Professor {
    @Id
    private Long professorId;
    private String professorName;

    private int age;
    private String address;

    @ManyToMany(mappedBy = "professors")
    private List<Subject> subjects = new ArrayList<>();


    public void addsubject(Subject subject) {
        this.subjects.add(subject);
    }
}
