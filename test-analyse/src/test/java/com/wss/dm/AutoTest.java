package com.wss.dm;

import com.wss.dm.analyse.bean.AutoTestCase;
import com.wss.dm.analyse.controller.AutoTestController;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by Administrator on 2016/11/2.
 */
public class AutoTest {
    @Test
    public void test1() throws Exception{

        System.setProperty("webdriver.firefox.bin", "E:\\install_package\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://192.168.30.20/login");
        // driver.get("http://www.baidu.com");
        Actions builder = new Actions(driver);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        password.submit();
    }
}
