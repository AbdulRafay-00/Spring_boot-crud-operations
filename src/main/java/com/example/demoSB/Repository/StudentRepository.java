package com.example.demoSB.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSB.Data_Base.Student_Tb;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student_Tb, Integer> {
    Optional<Student_Tb> findByEmail(String email);
}
