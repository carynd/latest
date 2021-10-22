package com.example.demo.repostiory;

import com.example.demo.entity.passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface passportrepositoy  extends JpaRepository<passport, Long> {
}
