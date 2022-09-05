import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement footerdriverSub = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int count  = footerdriverSub.findElements(By.tagName("a")).size();
		
		for(int i=1;i<count;i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerdriverSub.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
						//driver.navigate().back();
		}
		
		
		 Set<String> s = driver.getWindowHandles(); 
		 Iterator<String> st = s.iterator(); 
		 while(st.hasNext()) {
			 driver.switchTo().window(st.next());
			 System.out.println(driver.getTitle());
			 
		 }
		 /*for (String window : s) { 
		 driver.switchTo().window(window);
		 System.out.println(driver.getTitle()); 
		 Thread.sleep(2000); }*/
		
		
		
	}

}
