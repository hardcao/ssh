package com.ssh.model;

public class ProblemComment {
	private int problemID; // ��Ŀͳһ��ID�š�(int)
	private int commentTime; // ����ʱ�䡣 (int)
	private String commentContent; // �������ݡ�(String)
	private String problemPrompt; //��ʾ(String)
	private ProblemContent problem;
	public ProblemContent getProblem() {
		return problem;
	}
	public void setProblem(ProblemContent problem) {
		this.problem = problem;
	}
	public int getProblemID() {
		return problemID;
	}
	public void setProblemID(int problemID) {
		this.problemID = problemID;
	}
	public int getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(int commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getProblemPrompt() {
		return problemPrompt;
	}
	public void setProblemPrompt(String problemPrompt) {
		this.problemPrompt = problemPrompt;
	}
	
}
