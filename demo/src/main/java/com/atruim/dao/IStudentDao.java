package com.atruim.dao;

import java.util.List;

import com.atruim.Model.Student;

public interface IStudentDao {
	void saveStudent(Student student);

	void updateStudent(Student student);

	List<Student> getAllStudents();

}
