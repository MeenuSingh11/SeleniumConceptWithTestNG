package com.TestNG.Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNG {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	@Parameters({ "url", "emailID" })
	public void parameter(String url, String emailID) {
		driver.get(url);
		System.out.println(url);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(emailID);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).clear();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
