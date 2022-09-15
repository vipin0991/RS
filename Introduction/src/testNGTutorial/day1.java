package testNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void demo2() {
		System.out.println("Bye");
	}
}
