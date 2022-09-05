import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static void addItems(WebDriver driver, String[] names) {

		int M = 0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			
			String[] nm = products.get(i).getText().split("-");
			System.out.println("***"+products.get(i));
			
			List itemsNeeded = Arrays.asList(names);
			
		
				if(itemsNeeded.contains(nm[0].trim())) {  
					M++;
					System.out.println(driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i));
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					//Thread.sleep(5000);
					//driver.findElement(By.cssSelector(".button")).get(i).
					if(M==names.length)
						break;
				}
		}
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w = new WebDriverWait(driver,10);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names = {"Cucumber", "Brocolli","Beans","Musk Melon"};
		addItems(driver, names);
		
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//System.out.println(driver.findElement(By.className("promoInfo")).getText());
		

		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		
	}

}
