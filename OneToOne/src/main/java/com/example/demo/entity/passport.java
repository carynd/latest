package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity



public class passport {

    @Id

    private Long id;

    private String number;
   // @JsonManagedReference

//@JsonIgnore
//@JsonBackReference
    @OneToOne(mappedBy = "Passport", fetch = FetchType.LAZY)
    private student Student;

    public student getStudent() {
        return Student;
    }

    public void setStudent(student student) {
        this.Student = Student;
    }

    public passport(){

    }

    public passport(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", student=" + Student +
                '}';
    }
}



