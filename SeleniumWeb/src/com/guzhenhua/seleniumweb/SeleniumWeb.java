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
		
		//3�в�ͬ�ĵȴ�
//ǿ�Ƶȴ�
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//�@ʾ�ȴ�(���ܵȴ����ҵ��Ͳ����ˣ��Ҳ������O�õĕr�g�ھ�һֱ��)
//		new WebDriverWait(driver,15).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("css locator")));
//�[ʽ�ȴ���ȫ�ֵĵȴ���ÿ�Έ��в����@��Ԫ�ؕr�������ȴ���
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
