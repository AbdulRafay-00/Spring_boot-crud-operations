package com.example.demoSB.own_practic_model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSB.Data_Base.Student_Tb;
import com.example.demoSB.Repository.StudentRepository;

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/updateStu")
public class Put_DB {
    StudentRepository studentRepository;
    Put_DB(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
    
    @PutMapping("/{id}")
    @Transactional
    public String putMethodName(@PathVariable int id,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email )
        {
            String message = put_logic(id, name, email);
        return message;
    }





// put logic
    public String put_logic(int id, String name, String email ){
        Student_Tb student_Tb = studentRepository.findById(id).orElse(null);
        if (student_Tb != null) {

            if (name != null && name.length()> 0) {
                student_Tb.setName(name);
            }
            if (email != null) {
                student_Tb.setEmail(email);
            }
            return"Update Made Succesfully";
            
        }else{

            return "No Student Present Of This Id";
        }

    }
    
}
