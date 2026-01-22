package com.example.demoSB;
import org.springframework.boot.CommandLineRunner;
// import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSB.Data_Base.Student_Tb;
import com.example.demoSB.Repository.StudentRepository;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class DemoSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbApplication.class, args);

		System.out.println("sb");
		
	}
    // @Bean
	// CommandLineRunner commandLineRunner(StudenctRepository studentRepository){
	// 	System.out.println("inclrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
	// 	return args -> {
	// 		studentRepository.save(new Student_Tb("rafy", 20));
	// 	};
	// }

	@GetMapping("/")
	public String hello(){
		System.out.println("func 1");
		return "port working ";
	}
}
