package com.TestNG.Practise;

import org.testng.annotations.Test;

public class DependsOnMethodsConceptTestNG {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9 / 0;
	}

	@Test(dependsOnMethods = "loginTest")
	public void loginHomePageTest() {
		System.out.println("Enter into the home page");
	}

}
