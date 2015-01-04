package com.ssh.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.Admins;
import com.ssh.service.AdminManager;

public class TestAction extends ActionSupport {
	
	private AdminManager manager; 
	
	public void setAdminManager(AdminManager manager) {
		this.manager = manager;
	} 

    public String checkLogin()throws Exception{  
    	
    	HttpServletRequest req = ServletActionContext.getRequest();
    	String name = req.getParameter("name");
    	String pwd = req.getParameter("pwd");
    	
		Admins ad = new Admins();

		ad.setAdminName(name);
		ad.setAdminPwd(pwd);
		System.out.println(ad.getAdminName());
    	System.out.println(ad.getAdminPwd());

    	manager.save(ad);
    	System.out.println("save end");
    	return SUCCESS;  
    }
}
