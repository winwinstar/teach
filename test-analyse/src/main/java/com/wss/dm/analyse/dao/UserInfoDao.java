package com.wss.dm.analyse.dao;

import com.wss.dm.analyse.bean.UserInfo;

public interface UserInfoDao {
	public UserInfo loginUserInfo(UserInfo userInfo) throws Exception;
}
