package com.example.demo.repostiory;


import com.example.demo.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository   extends JpaRepository<student, Long> {
}
