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
@Table( uniqueConstraints = { @UniqueConstraint(columnNames = {"passport_id"})})
public class student {

    @Id


    private Long id;
    private String name;

    //    @OneToOne(fetch = FetchType.LAZY)
    //@JsonBackReference
@JsonIgnore
//@JsonManagedReference
    @OneToOne(fetch= FetchType.LAZY)
    private passport Passport;

    public passport getPassport() {
        return Passport;
    }

    public void setPassport(passport passport) {
        this.Passport = Passport;
    }

    public student(){

    }

    public student(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passport=" + Passport +
                '}';
    }
}



