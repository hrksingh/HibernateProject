package com.map;

import java.util.ArrayList;
import java.util.List;

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
        q1.setQuestion("Which of the following is not a Java features ?");
        
        Answer a1 = new Answer(101,"Dynamic",q1);
        Answer a2 = new Answer(102,"Architecture Neutral",q1);
        Answer a3 = new Answer(103,"Use of pointers",q1);
        Answer a4 = new Answer(104,"Object-oriented",q1);
        
        List<Answer> answerList = new ArrayList<Answer>();
        answerList.add(a1);
        answerList.add(a2);
        answerList.add(a3);
        answerList.add(a4);
        
        q1.setAnswer(answerList);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		//Saving........
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		
		tx.commit();
		
		//fetching................
		
		Question ques = session.get(Question.class, 1);
		System.out.println(ques.getQuestion());
		
		for (Answer answer : ques.getAnswer()) {
			System.out.println(answer.getAnswer());
		}
		
		session.close();
		HibernateUtil.getSessionFactory().close();
		
        
    }
}
