package com.placementPrep.springboot.Studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.placementPrep.springboot.Studentmanagementsystem.entity.Student;
import com.placementPrep.springboot.Studentmanagementsystem.repository.StudentRepository;
import com.placementPrep.springboot.Studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	private StudentRepository studentRepository;
	
	 
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
	return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
