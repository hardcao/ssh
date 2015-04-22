package com.ssh.model;

import java.util.Set;

public class ProblemContent {
	private int problemID;  // 问题的id号。(int)
	private String problemContent; //问题的题干描述 (string)
	private int problemType; //题目类型 （int）
	private String problemFrom; //题目来源  (string)
	private int problemLevel; //题目难易等级 (int)
	private String  problemKnowledgePoint; // 题目考察的知识点  (string)
	private String problemLanguage; // 题目所属语言 (string)
	private String problemSolutionWay; // 解题思路 (string)
	private int nextProblemID; // 下一个题目的ID (int)
	private int uploadProblemUserID; // 上传人的ID(int)
	private Set<ProblemComment> commentList; // 相应的评论
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
	private int problemScore; // 题目的分数 (int)
}
