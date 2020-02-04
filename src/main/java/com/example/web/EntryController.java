package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class EntryController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	@ResponseBody
	public List<Student> fetchAllStudents() {
		return studentService.fetchAllStudents();
	}

	@GetMapping("/students/{id}")
	@ResponseBody
	Student fetchStudentById(@PathVariable("id") Long id) {
		return studentService.fetchStudentById(id);

	}

	@GetMapping("/students/count")
	@ResponseBody
	Long totalStudentCounts() {
		return studentService.totalStudentCounts();
	}
}
