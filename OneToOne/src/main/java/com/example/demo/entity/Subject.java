package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    private Long subjectId;

    @Column(nullable = false)
    private String subjectName;
    private String timing;
    private String roomNo;
    private String duration;
    @JsonIgnore
    @ManyToMany

    @JoinTable(uniqueConstraints = {@UniqueConstraint(columnNames = {"SUBJECT_ID","PROFESSOR_ID",})}, name = "Professor_Subjects",
            joinColumns = @JoinColumn(name ="SUBJECT_ID" ),
            inverseJoinColumns = @JoinColumn(name = "PROFESSOR_ID"))
    private List<Professor> professors = new ArrayList<>();


    public void addprofessor(Professor professor) {
        this.professors.add(professor);
    }
}
