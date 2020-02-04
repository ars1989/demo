package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {

	List<Student> fetchAllStudents();

	Student fetchStudentById(Long id);

	Long totalStudentCounts();
}
