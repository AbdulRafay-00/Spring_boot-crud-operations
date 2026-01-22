package com.example.demoSB.own_practic_model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSB.Data_Base.Student_Tb;
import com.example.demoSB.Repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/realStu")
public class GetFromDB {

    // private final Repository.StudentRepository studentRepository;
    private final StudentRepository studentRepository;
    @Autowired
    GetFromDB(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping()
    public List<Student_Tb> getMethodRDB() {
        return studentRepository.findAll();
    }
    
    
}
