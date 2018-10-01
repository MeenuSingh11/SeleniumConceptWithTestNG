package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.utest.com/signup/personal");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);

		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// String actualTitle = driver.getTitle();
		// if (actualTitle.equals("User SignUp - uTest"))
		//
		// System.out.println("correct title");
		// else
		// System.out.println("Incorrect title");

		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("meenu");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("bitmeenusingh.11@gmail.com");

		// Select select = new Select(driver.findElement(By.xpath("//label[text()='Date
		// of birth:']")));
		//
		// Thread.sleep(3000);
		// select.selectByVisibleText("August");

		WebElement options = driver.findElement(By.xpath("//label[text()='Date of birth:']"));
		Select select = new Select(options);
		select.deselectByVisibleText("August");

		// driver.quit();

	}

}
