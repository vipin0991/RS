package testNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("WebLoginHomeLoan");
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	@Parameters({"URL","key"})
	@Test(groups= {"Smoke"})
	public void APILoginHomeLoan(String url, String key) {
		System.out.println("APILoginHomeLoan");
		System.out.println(url);
		System.out.println(key);
	}

}
