package com.placementPrep.springboot.Studentmanagementsystem.service;

import java.util.List;

import com.placementPrep.springboot.Studentmanagementsystem.entity.Student;

public interface StudentService {

List<Student> getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);
Student updateStudent(Student student);
void deleteStudentById(Long id);

}
