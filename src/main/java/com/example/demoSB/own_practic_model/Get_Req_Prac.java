package com.example.demoSB.own_practic_model;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class Get_Req_Prac {
    private String name;
    private String email;
    private String dob;
    private int age;

    Get_Req_Prac(String name, int age, String email , String dob){
        this.name = name;
        this.age = age;
        this.email = email;
        this.dob = dob;

    }


    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }
    public String getDob (){
        return dob;
    }

}





// get request
@RestController
class Req_Prac {
@GetMapping("/owngetreq")
    public Get_Req_Prac getcall(){
        return new Get_Req_Prac("rafay", 12,"rafay@gmail.com", "12-3-2005");
        // obj.getname();
        // obj.getage();
        // obj.getemail();

    }
}
