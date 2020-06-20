package com.map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Answer;
import model.Question;
import util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        Question q1 = new Question();
        q1.setQuestionId(1);
        q1.setQuestion("Name the Java IDE’s?");
        Answer a1  = new Answer();
        a1.setAnswerId(45);
        a1.setAnswer("Eclipse and NetBeans are the IDE's of JAVA.");
        q1.setAnswer(a1);
        
        
        Question q2 = new Question();
        q2.setQuestionId(2);
        q2.setQuestion("What is the purpose of a transient variable?");
        Answer a2  = new Answer();
        a2.setAnswerId(38);
        a2.setAnswer("Transient variables are not part of the serialization process. During deserialization, the values of the transient variables are set to the default value. It is not used with static variables.");
        q2.setAnswer(a2);
        
        
        Question q3 = new Question();
        q3.setQuestionId(3);
        q3.setQuestion("How does Java enable high performance?");
        Answer a3  = new Answer();
        a3.setAnswerId(41);
        a3.setAnswer("Java uses Just In Time compiler to enable high performance. It is used to convert the instructions into bytecodes.");
        q3.setAnswer(a3);
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		// saving objects
	
		session.save(q1);
		session.save(q2);
		session.save(q3);
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		

		tx.commit();
		session.close();
		HibernateUtil.getSessionFactory().close();
    }
}
