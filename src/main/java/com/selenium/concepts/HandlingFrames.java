package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("MeenuS");
		driver.findElement(By.name("password")).sendKeys("abc123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
