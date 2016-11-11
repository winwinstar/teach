package com.wss.dm.analyse.business;


import com.wss.dm.analyse.bean.UserInfo;
import com.wss.dm.analyse.dao.UserInfoDao;


public class UserInfoBusiness {
	private UserInfoDao userInfoDao = null;

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public UserInfo loginUserInfo(UserInfo userInfo) throws Exception{
	
		return userInfoDao.loginUserInfo(userInfo);
	}
	
}


