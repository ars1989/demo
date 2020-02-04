package com.example.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private final List<Student> studentList = new ArrayList<Student>(Arrays.asList(

			new Student(1l, "Raj", "kumar", "rk@gmail.com"), new Student(2l, "Reshma", "pande", "rp@gmail.com"),
			new Student(3l, "Surabh", "gupta", "sg@gmail.com"), new Student(5l, "Gaurav", "kappoor", "gk@gmail.com"),
			new Student(4l, "Vaibhav", "Sharma", "vs@gmail.com")

	));

	@Override
	public List<Student> fetchAllStudents() {
		return studentList;
	}

	@Override
	public Student fetchStudentById(Long id) {
		if (id == null) {
			return null;
		}
		for (Student student : studentList) {
			if (student.getId().equals(id)) {
				return student;
			}
		}

		return null;

	}

	@Override
	public Long totalStudentCounts() {
		return Long.valueOf(studentList.size());
	}
}
