package com.example.demoSB.own_practic_model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSB.Data_Base.Student_Tb;
import com.example.demoSB.Repository.StudentRepository;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/postdb")
public class Post_Db {
    StudentRepository studentRepository;
    Post_Db(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public String postMethodName(@RequestBody Student_Tb student_Tb) {
    studentRepository.findByEmail(student_Tb.getEmail());
    
    if (studentRepository.findByEmail(student_Tb.getEmail()).isPresent()) {
        return"Student email already present ";
    }else{
        studentRepository.save(student_Tb);
        
        return "Added";
    }
    }
    
}
