package com.soebes.testing.testng;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@Test(groups = { Groups.Slow })
	public void thisIsTheFirstTest() {
		System.out.println("thisIsTheFirstTest");
	}

	@Test(groups = { Groups.Medium })
	public void thisIsTheSecondTest() {
		System.out.println("thisIsTheSecondTest");
	}

	@Test(groups = { Groups.Fast })
	public void thisIsTheThirsTest() {
		System.out.println("thisIsTheThirdTest");
	}
}
