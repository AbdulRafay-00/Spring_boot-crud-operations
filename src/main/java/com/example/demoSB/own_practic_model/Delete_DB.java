package com.example.demoSB.own_practic_model;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSB.Data_Base.Student_Tb;
import com.example.demoSB.Repository.StudentRepository;
@RestController
@RequestMapping("/delete_stu")
public class Delete_DB {
    StudentRepository studentRepository;
    Delete_DB(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @DeleteMapping("/{id}")
    public String deleteMethod(@PathVariable int id){
    String message = deleteLogic(id);
        return message;
    }




// delete logic
    public String deleteLogic(int id){
        Student_Tb student_Tb = studentRepository.findById(id).orElse(null);
        if (student_Tb != null) {
            studentRepository.deleteById(id);
            return"Delete Sucessfully";
        }else{
            return"Delete Request Failed";
        }
    }

}
