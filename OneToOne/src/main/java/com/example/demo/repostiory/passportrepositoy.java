package com.example.demo.repostiory;

import com.example.demo.entity.passport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface passportrepositoy  extends JpaRepository<passport, Long> {
}
