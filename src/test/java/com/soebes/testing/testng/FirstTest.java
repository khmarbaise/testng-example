package com.soebes.testing.testng;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenerX.class})
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
	public void thisIsTheFirstTest() throws InterruptedException {
		Thread.sleep(TimeUnit.MILLISECONDS.convert(2250, TimeUnit.MILLISECONDS));
		System.out.println("thisIsTheFirstTest");
	}

	@Test(groups = { Groups.Medium })
	public void thisIsTheSecondTest() throws InterruptedException {
		Thread.sleep(TimeUnit.MILLISECONDS.convert(1500, TimeUnit.MILLISECONDS));
		System.out.println("thisIsTheSecondTest");
	}

	@Test(groups = { Groups.Fast }, invocationCount=5)
	public void thisIsTheThirdTest() throws InterruptedException {
		Thread.sleep(TimeUnit.MILLISECONDS.convert(250, TimeUnit.MILLISECONDS));
		System.out.println("thisIsTheThirdTest");
	}
}
