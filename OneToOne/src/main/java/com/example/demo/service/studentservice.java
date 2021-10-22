package com.example.demo.service;

import com.example.demo.DemoApplication;
import com.example.demo.entity.passport;
import com.example.demo.entity.student;
import com.example.demo.repostiory.passportrepositoy;
import com.example.demo.repostiory.studentrepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class studentservice {
    @Autowired
    studentrepository studentRepository;
    @Autowired
    passportrepositoy passportRepository;



    static final Logger log=
            LoggerFactory.getLogger(DemoApplication.class);



    public student findById(Long id){
        log.info("findById is called");

        student Student = studentRepository.findById(id).get();
        return Student;
    }

    public List<student> getAllStudents(){
        List<student> Students = studentRepository.findAll();
        return Students;
    }

    public String deleteStudent(long del_id) {
        student b1=studentRepository.findById(del_id).get();

        try{
            studentRepository.delete(b1);
            return "deleted";
        }
        catch (Exception ex){
            return "delete failed";
        }
    }


/*
  public List<student> getAllStudents(){
        List<student> AllStudent = studentRepository.findAll();
        return AllStudent;
    }
    public student addStudent(student Student) {

        return studentRepository.save(Student);
    }

    // Purpose  Give this function : Student Id
    // OUTPUT : Information of your passport


    @Transactional
    public void getPassportOfStudent(Long studentId) {
        student Student = studentRepository.findById(studentId).get();
        System.out.println(Student.getPassport().getPassportId());
        System.out.println(Student.getPassport().getPassportNo());
    }



    public void addPassport() {

        student Student = studentRepository.findById(342L).get();
        passport Passport = new passport(258L, "eegeg");

        passportRepository.save(Passport);

        student.setPassport(Passport);
        studentRepository.save(Student);

    }

    public student assignPassport(Long studentId, passport Passport) {

        // Step 1 : Get Student Object

        student Student = studentRepository.findById(studentId).get();


        passportRepository.save(Passport);

        student.setPassport(Passport);
        studentRepository.save(Student);

        return Student;
    }



 */
}
