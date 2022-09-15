package testNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Test(dataProvider="getData")
	public void padLoginCarLoan(String username, String password) {
		System.out.println("padLoginCarLoan");
		System.out.println(username+" "+password);
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
	}
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}
	@Parameters({"URL","key"})
	@Test
	public void APILoginCarLoan(String url, String key) {
		System.out.println("APILoginCarLoan");
		System.out.println(url);
		System.out.println(key);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data =  new Object[3][2];
		data[0][0] = "firstUserName";
		data[0][1] = "firstUserPassword";
		
		data[1][0] = "secondUserName";
		data[1][1] = "secondUserPassword";
		
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdUserPassword";
		
		return data;
	}
	
}
