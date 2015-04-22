package com.ssh.model;

public class UserInfo {
	private String userName; // 用户名 (string)
	private int userID; // 用户唯一的ID (int)  
	private String password; // 用户密码 (string)
	private int userScore; // 用户做题的得分 (int)
	private int userDoneProblemCount; // 用户做题数(int)
	private int userStarCount; //  用户得了多少星星(int)
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
