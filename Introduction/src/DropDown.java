import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Delhi (DEL)' or @class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("ben");
		//driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).sendKeys("ben");
		//driver.findElement(By.xpath("//div[text()='From']")).sendKeys("ben");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("che");
		driver.findElement(By.xpath("//div[text()='Chennai International Airport']")).click();
	}

}
