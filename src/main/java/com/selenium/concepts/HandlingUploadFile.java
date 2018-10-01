package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingUploadFile {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("B:\\Work\\RESUME\\Meenu_Singh_CV1.doc");

	}
}
