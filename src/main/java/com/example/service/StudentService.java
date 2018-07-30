package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(String firstName , String lastName, String section){
		
		return studentRepository.save(new Student(firstName,lastName,section));
		
		
	}
	
	public List<Student> searchAll(){
		
		return studentRepository.findAll();
	}
	
	public long total(){
		return studentRepository.count();
	}
}
