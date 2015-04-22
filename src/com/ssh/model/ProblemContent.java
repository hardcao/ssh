package com.ssh.model;

import java.util.Set;

public class ProblemContent {
	private int problemID;  // �����id�š�(int)
	private String problemContent; //������������ (string)
	private int problemType; //��Ŀ���� ��int��
	private String problemFrom; //��Ŀ��Դ  (string)
	private int problemLevel; //��Ŀ���׵ȼ� (int)
	private String  problemKnowledgePoint; // ��Ŀ�����֪ʶ��  (string)
	private String problemLanguage; // ��Ŀ�������� (string)
	private String problemSolutionWay; // ����˼· (string)
	private int nextProblemID; // ��һ����Ŀ��ID (int)
	private int uploadProblemUserID; // �ϴ��˵�ID(int)
	private Set<ProblemComment> commentList; // ��Ӧ������
	public Set<ProblemComment> getCommentList() {
		return commentList;
	}
	public void setCommentList(Set<ProblemComment> commentList) {
		this.commentList = commentList;
	}
	public int getProblemID() {
		return problemID;
	}
	public void setProblemID(int problemID) {
		this.problemID = problemID;
	}
	public String getProblemContent() {
		return problemContent;
	}
	public void setProblemContent(String problemContent) {
		this.problemContent = problemContent;
	}
	public int getProblemType() {
		return problemType;
	}
	public void setProblemType(int problemType) {
		this.problemType = problemType;
	}
	public String getProblemFrom() {
		return problemFrom;
	}
	public void setProblemFrom(String problemFrom) {
		this.problemFrom = problemFrom;
	}
	public int getProblemLevel() {
		return problemLevel;
	}
	public void setProblemLevel(int problemLevel) {
		this.problemLevel = problemLevel;
	}
	public String getProblemKnowledgePoint() {
		return problemKnowledgePoint;
	}
	public void setProblemKnowledgePoint(String problemKnowledgePoint) {
		this.problemKnowledgePoint = problemKnowledgePoint;
	}
	public String getProblemLanguage() {
		return problemLanguage;
	}
	public void setProblemLanguage(String problemLanguage) {
		this.problemLanguage = problemLanguage;
	}
	public String getProblemSolutionWay() {
		return problemSolutionWay;
	}
	public void setProblemSolutionWay(String problemSolutionWay) {
		this.problemSolutionWay = problemSolutionWay;
	}
	public int getNextProblemID() {
		return nextProblemID;
	}
	public void setNextProblemID(int nextProblemID) {
		this.nextProblemID = nextProblemID;
	}
	public int getUploadProblemUserID() {
		return uploadProblemUserID;
	}
	public void setUploadProblemUserID(int uploadProblemUserID) {
		this.uploadProblemUserID = uploadProblemUserID;
	}
	public int getProblemScore() {
		return problemScore;
	}
	public void setProblemScore(int problemScore) {
		this.problemScore = problemScore;
	}
	private int problemScore; // ��Ŀ�ķ��� (int)
}
