package com.ssh.model;

/**
 * Admins entity. @author MyEclipse Persistence Tools
 */

public class Admins implements java.io.Serializable {

	// Fields

	private Integer admnId;
	private String adminName;
	private String adminPwd;

	// Constructors

	/** default constructor */
	public Admins() {
	}

	/** full constructor */
	public Admins(String adminName, String adminPwd) {
		this.adminName = adminName;
		this.adminPwd = adminPwd;
	}

	// Property accessors

	public Integer getAdmnId() {
		return this.admnId;
	}

	public void setAdmnId(Integer admnId) {
		this.admnId = admnId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

}