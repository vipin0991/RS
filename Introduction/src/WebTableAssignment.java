import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		int row = driver.findElements(By.cssSelector(".table-display tr")).size();
		int col = driver.findElements(By.cssSelector(".table-display th")).size();
		
		System.out.println("Total rows are "+row+","+" Total columns are "+col);
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
		List<WebElement> li = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		for(int i=0;i<li.size();i++) {
			System.out.print(driver.findElements(By.cssSelector(".table-display tr:nth-child(3)")).get(i).getText());
		}

	}

}
