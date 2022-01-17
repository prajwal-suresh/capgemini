package org.capgemini.service.impl;

import java.util.List;

import org.capgemini.entity.Student;
import org.capgemini.repository.StudentRepository;
import org.capgemini.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
	
	
	public StudentRepository studentRepo;

	public StudentServiceImp(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getStudents() {
		
		return studentRepo.findAll();
	}

}
