import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.id("password")).sendKeys("learning");
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' User']//following-sibling::span")));
		driver.findElement(By.xpath("//span[text()=' User']//following-sibling::span")).click();
		
	
		//Alert a1 = driver.switchTo().alert();
		//w.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		//a1.dismiss();*/
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement e = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select s = new Select(e);
		s.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".my-4")));
		
		List<WebElement> prod =  driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<prod.size();i++) {
			prod.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		

	}

}
