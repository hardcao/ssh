package com.ssh.model;

public class UserDoneProblem {
	private int userID; // 用户唯一ID (int)
	private int problemID; // 题目ID(int)
	private int doneType; // 1 做过的题目， 2 看过的题目
	public int getDoneType() {
		return doneType;
	}
	public void setDoneType(int doneType) {
		this.doneType = doneType;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getProblemID() {
		return problemID;
	}
	public void setProblemID(int problemID) {
		this.problemID = problemID;
	}
}
