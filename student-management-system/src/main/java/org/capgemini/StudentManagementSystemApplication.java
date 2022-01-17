package org.capgemini;

import org.capgemini.entity.Student;
import org.capgemini.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
		//store data to get on browser
		Student student=new Student(100L,"Prajwal","S","praj@gmail.com");
		studentRepo.save(student);
		Student studentone=new Student(101L,"Sachin","A","sachin@gmail.com");
		studentRepo.save(studentone);
		Student studenttwo=new Student(102L,"Subham","M","subham@gmail.com");
		studentRepo.save(studenttwo);
	}

}
