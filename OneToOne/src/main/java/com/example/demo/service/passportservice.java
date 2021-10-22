package com.example.demo.service;

import com.example.demo.entity.passport;
import com.example.demo.repostiory.passportrepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class passportservice {
    @Autowired
    passportrepositoy passportRepository;




    public List<passport> getAllPassport() {
        return passportRepository.findAll();
    }

    public passport findById(Long id){
        passport Passport = passportRepository.findById(id).get();
        return Passport;
    }
    /*
    public List<passport> getAllPassport() {
        return passportRepository.findAll();
    }

    public passport insertPassport(passport Passport) {
        return passportRepository.save(Passport);

    }


    public boolean deletePassport(Long passportId) {
        passport Passport = passportRepository.findById(passportId).get();

        try{
            passportRepository.delete(Passport);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
    */

}
