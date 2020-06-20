package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answer_table")
public class Answer {
	
	@Id
	@Column(name = "answer_id")
	private int answerId;
	
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "ques_id")
	private Question question;

	public Answer() {
		super();
	}

	public Answer(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return String.format("Answer [answerId=%s, answer=%s, question=%s]", answerId, answer, question);
	}

	
}
