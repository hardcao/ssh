package com.ssh.model;

public class UserInfo {
	private String userName; // �û��� (string)
	private int userID; // �û�Ψһ��ID (int)  
	private String password; // �û����� (string)
	private int userScore; // �û�����ĵ÷� (int)
	private int userDoneProblemCount; // �û�������(int)
	private int userStarCount; //  �û����˶�������(int)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserScore() {
		return userScore;
	}
	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}
	public int getUserDoneProblemCount() {
		return userDoneProblemCount;
	}
	public void setUserDoneProblemCount(int userDoneProblemCount) {
		this.userDoneProblemCount = userDoneProblemCount;
	}
	public int getUserStarCount() {
		return userStarCount;
	}
	public void setUserStarCount(int userStarCount) {
		this.userStarCount = userStarCount;
	}
}
