package com.atruim.demo;

import java.util.List;

import com.atruim.Model.Student;
import com.atruim.dao.IStudentDao;
import com.atruim.dao.StudentDao;

public class App {

	public static void main(String[] args) {

		IStudentDao studentDao = new StudentDao();

		Student studentX = new Student("Hrk", "Singh", "hrk@gmail.com");
		Student studentY = new Student("Abc", "Mason", "ab@gmail.com");
		Student studentZ = new Student("Ram", "Singh", "ram@gmail.com");
		studentDao.saveStudent(studentX);
		studentDao.saveStudent(studentY);
		studentDao.saveStudent(studentZ);

		studentX.setFirstName("Hrks");
		studentDao.updateStudent(studentX);

		List<Student> students = studentDao.getAllStudents();
		students.forEach(student1 -> {
			System.out.print(student1.getId() +"--> ");
			System.out.println(student1.getFirstName());

		});

	}
}