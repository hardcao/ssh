package com.ssh.dao;

import java.util.List;
import com.ssh.model.UserInfo;

public interface UserInfoDao {
	public boolean createUser(String userName, String password);
	public List<UserInfo> getUserInfoByName(String userName);
	public UserInfo getUserInfoByUserID(int userID);
	
}
