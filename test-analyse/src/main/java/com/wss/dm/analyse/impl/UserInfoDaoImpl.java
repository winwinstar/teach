package com.wss.dm.analyse.impl;

import com.wss.dm.analyse.bean.UserInfo;
import com.wss.dm.analyse.dao.UserInfoDao;
import com.wss.dm.analyse.util.BasicSqlSupport;

public class UserInfoDaoImpl extends BasicSqlSupport implements UserInfoDao{

	public UserInfo loginUserInfo(UserInfo userInfo) throws Exception {
		// TODO Auto-generated method stub
		UserInfo result = new UserInfo();
		result = this.session.selectOne("com.wss.dm.analyse-web.mybatis.mapper.Test.loginUserInfo",userInfo);
	
		return result;
	}

}
