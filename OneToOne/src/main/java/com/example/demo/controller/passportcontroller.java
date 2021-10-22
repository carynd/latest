package com.example.demo.controller;

import com.example.demo.entity.passport;
import com.example.demo.service.passportservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class passportcontroller {
    @Autowired
    passportservice passportService;





    @GetMapping("/passports")
    public List<passport> getAllPassport(){
        return passportService.getAllPassport();
    }


}
