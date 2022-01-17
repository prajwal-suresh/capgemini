package org.capgemini.controller;

import org.capgemini.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	//handler method to handle list of students
	@RequestMapping("/student")
	public String listStudents(Model model) {
		model.addAttribute("student",studentService.getStudents());
		return "student";
	}

}
