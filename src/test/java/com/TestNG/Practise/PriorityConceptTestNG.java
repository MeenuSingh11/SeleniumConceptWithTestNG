package com.TestNG.Practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityConceptTestNG {

	@BeforeMethod
	public void setup() {
		System.out.println("Introduction");

	}

	@Test(priority = 1)
	public void introduction() {
		System.out.println("My name is Meenu Singh");
	}

	@Test(priority = 3)
	public void work() {
		System.out.println("I am working here in Emirates Airline");

	}

	@Test(priority = 2)
	public void birthOfPlace() {
		System.out.println("I born/broughtup in India");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("End");
	}
}
