package com.ssh.model;

public class UserDoneProblem {
	private int userID; // �û�ΨһID (int)
	private int problemID; // ��ĿID(int)
	private int doneType; // 1 ��������Ŀ�� 2 ��������Ŀ
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
