package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Emp;
import model.Projects;
import util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        
        Projects p1 = new Projects();
        Projects p2 = new Projects();
        Projects p3 = new Projects();
        
        e1.setEid(101);
        e1.setEmpName("Ram");
        
        e2.setEid(102);
        e2.setEmpName("Shayam");
        
        p1.setPid(24);
        p1.setProjectName("OMS");
        
        p2.setPid(96);
        p2.setProjectName("WMS");
        
        p3.setPid(28);
        p3.setProjectName("FMS");
        
        List<Projects> projList = new ArrayList<Projects>();
        projList.add(p1);
        projList.add(p2);
        
        e1.setProjectsList(projList);
        
        
        List<Emp> empList = new ArrayList<Emp>();
        empList.add(e1);
        empList.add(e2);
        
        p3.setEmpList(empList);
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		//Saving........
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		
		//fetching.........
		
		//All projects hold by emp1
		
		Emp em = session.get(Emp.class, 101);
		List<Projects> p = em.getProjectsList();
		for (Projects projects : p) {
			System.out.println(projects.getProjectName());
		}
		
		
		//All employees working on given project id
		Projects pro = session.get(Projects.class, 28);
		for (Emp e : pro.getEmpList()) {
			System.out.println(e.getEmpName());
			
		}
		
		session.close();
		HibernateUtil.getSessionFactory().close();
        
    }
}
