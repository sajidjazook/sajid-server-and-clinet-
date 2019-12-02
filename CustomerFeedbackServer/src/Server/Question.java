package Server;

import java.io.Serializable;

public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String question;
	String answers;
	int id;
	boolean active;	
	
	public Question(String question, String answers, int id, boolean active) {
		super();
		this.question = question;
		this.answers = answers;
		this.id = id;
		this.active = active;
	}

	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswers() {
		return answers;
	}


	public void setAnswers(String answers) {
		this.answers = answers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	
	
	
	
	
}
