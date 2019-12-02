package Server;

import java.io.Serializable;

public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int qid;
	private int id;
	private String type;
	private int []answerIndexes; 
	
	
	public Response(int qid, int id, String type, int[] answerIndexes) {
		super();
		this.qid = qid;
		this.id = id;
		this.type = type;
		this.answerIndexes = answerIndexes;
	}


	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int[] getAnswerIndexes() {
		return answerIndexes;
	}


	public void setAnswerIndexes(int[] answerIndexes) {
		this.answerIndexes = answerIndexes;
	}
	
}
