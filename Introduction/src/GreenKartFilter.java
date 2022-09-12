import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKartFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String search = "Carrot";
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys(search);
		
		List<WebElement> e = driver.findElements(By.xpath("//tr/td[1]"));
		System.out.println("####"+e.size());
			//Assert.assertTrue(e.get(0).getText().equalsIgnoreCase(search));
		List<WebElement> filtered = e.stream().filter(s->s.getText().equalsIgnoreCase(search)).collect(Collectors.toList());
		System.out.println("****"+filtered.size());
		Assert.assertEquals(e.size(), filtered.size());
		
		

	}

}
