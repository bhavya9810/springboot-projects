package com.placementPrep.springboot.Studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.placementPrep.springboot.Studentmanagementsystem.entity.Student;
import com.placementPrep.springboot.Studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1=new Student("Bhavya", "Singh", "bhavya.singh33@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Shubham",null, "shubham@gmail.com");
//		studentRepository.save(student2);
//		Student student3=new Student("Bravo","champion","djBravo@gmail.com");
//		studentRepository.save(student3);
//		Student student4=new Student("Sachin",null,"tendulkar33@gmail.com");
//		studentRepository.save(student4);
	}

}
