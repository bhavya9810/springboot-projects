package com.placementPrep.springboot.Studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placementPrep.springboot.Studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
