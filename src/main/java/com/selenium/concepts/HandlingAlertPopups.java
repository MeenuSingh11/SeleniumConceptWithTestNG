package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopups {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		if (str.equals("Please enter a valid user name"))
			System.out.println("Correct alert message");
		else
			System.out.println("Incorrect aleret message");
		alert.accept();
		driver.quit();

	}
}
