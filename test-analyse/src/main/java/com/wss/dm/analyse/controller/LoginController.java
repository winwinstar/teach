package com.wss.dm.analyse.controller;

import com.wss.dm.analyse.bean.UserInfo;
import com.wss.dm.analyse.business.UserInfoBusiness;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/login.do")
public class LoginController {
	
	@Resource(name="UserInfoBusiness")
	private UserInfoBusiness userInfoBusiness = null;
	public void setBusiness(UserInfoBusiness userInfoBusiness){
		this.userInfoBusiness = userInfoBusiness;
	}

	@RequestMapping
	public String viewUser(HttpServletRequest request,HttpServletResponse response,UserInfo userInfo)
		throws Exception {
		request.setCharacterEncoding("utf-8");
		UserInfo result = new UserInfo();
		String name = null;
		String passWord = null;
		if (request.getParameter("userName") != null && request.getParameter("passWord") != null) {
			name = request.getParameter("userName");
			passWord = request.getParameter("passWord");
			userInfo.setName(name);
			userInfo.setPassWord(passWord);
			result = userInfoBusiness.loginUserInfo(userInfo);
		} else {
			return "index";
		}
		request.setAttribute("userInfo1",result);
		return "case";
	}
}
