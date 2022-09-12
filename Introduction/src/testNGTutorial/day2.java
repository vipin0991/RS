package testNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I will be execute before class in day 2");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("I will be executed after class in day 2");
	}
	
	
	@Test(enabled=false)
	public void ploan() {
		System.out.println("Requested");
	}
	@Test
	public void ploan2() {
		System.out.println("Granted");
	}
	@Test(groups= {"Smoke"})
	public void ploan3() {
		System.out.println("Not Eligible");
	}
	@BeforeSuite()
	public void beforeSuite(){
		System.out.println("BeforeSuite");
	}
	@Test(dependsOnMethods= {"ploan3"})
	public void perloan4() {
		System.out.println("perloan4");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will be executed before every method of same class in which I am defined");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("I will be executed after every method of same class in which I am defined");
	}
}
