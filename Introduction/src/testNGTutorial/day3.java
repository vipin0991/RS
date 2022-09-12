package testNGTutorial;

import org.testng.annotations.Test;

public class day3 {
	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
	}
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}
	@Test
	public void APILoginCarLoan() {
		System.out.println("APILoginCarLoan");
	}
}
