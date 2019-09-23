package com.guzhenhua.seleniumweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/42247/Desktop/guzhenhua/code/java_web_auto/SeleniumWeb/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		//3中不同的等待
//强制等待
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//顯示等待(智能等待，找到就不等了，找不到在設置的時間内就一直等)
//		new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("css locator")));
//隱式等待（全局的等待，每次執行查找這個元素時，都會等待）
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
