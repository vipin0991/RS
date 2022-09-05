import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("test");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("submit")).click();
		
		//String error = driver.findElement(By.cssSelector("p.error")).getText();
		//System.out.println(error);
		
		driver.findElement(By.linkText("Forgot your password?")).click();

		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vipin");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vipin.dhiman21@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vipin.dhiman22@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String msg = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(msg);
		
		driver.findElement(By.xpath("// div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.quit();
	}

}
