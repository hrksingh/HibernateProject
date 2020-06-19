package com.atruim;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Certificate;
import model.Student;
import util.HibernateUtil;

public class App {
	public static void main(String[] args) {

		Student student = new Student();
		student.setId(100);
		student.setName("Nobita");
		Certificate ct = new Certificate();
		ct.setCourse("Java");
		ct.setDuration("2 months");
		student.setCertificate(ct);

		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Doraemon");
		Certificate ct1 = new Certificate();
		ct1.setCourse("Android");
		ct1.setDuration("4 months");
		student1.setCertificate(ct1);

		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Jiyan");
		Certificate ct2 = new Certificate();
		ct2.setCourse("Python");
		ct2.setDuration("3 months");
		student2.setCertificate(ct2);

		Student student3 = new Student();
		student3.setId(103);
		student3.setName("Suniyo");
		Certificate ct3 = new Certificate();
		ct3.setCourse("C++");
		ct3.setDuration("6 months");
		student3.setCertificate(ct3);

		Student student4 = new Student();
		student4.setId(104);
		student4.setName("Shizuka");
		Certificate ct4 = new Certificate();
		ct4.setCourse("Hibernate");
		ct4.setDuration("8 weeks");
		student4.setCertificate(ct4);

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		// saving objects
		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);

		tx.commit();
		session.close();
		HibernateUtil.getSessionFactory().close();
	}
}
