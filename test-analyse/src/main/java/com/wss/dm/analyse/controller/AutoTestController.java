package com.wss.dm.analyse.controller;

import com.wss.dm.analyse.bean.AutoTestCase;
import net.sf.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/11/2.
 */
@Controller
@RequestMapping("/autoTest.do")
public class AutoTestController {

    @RequestMapping
    public void doTest(HttpServletRequest request, HttpServletResponse response, AutoTestCase autoTestCase)
            throws Exception {
            request.setCharacterEncoding("utf-8");
            if(request.getParameter("data") != null) {
                String data = request.getParameter("data");
                JSONObject jsonObject = JSONObject.fromObject(data.substring(1, data.length() - 1));

                AutoTestCase atc = (AutoTestCase) JSONObject.toBean(jsonObject, AutoTestCase.class);

                System.setProperty("webdriver.firefox.bin", "E:\\install_package\\Mozilla Firefox\\firefox.exe");
                WebDriver driver = new FirefoxDriver();
                driver.get("http://192.168.30.20/login");
                // driver.get("http://www.baidu.com");
                Actions builder = new Actions(driver);

                WebElement username = driver.findElement(By.name("username"));
                username.sendKeys(atc.getArg1());
                WebElement password = driver.findElement(By.name("password"));
                password.sendKeys(atc.getArg2());
                password.submit();
            }
    }
}
