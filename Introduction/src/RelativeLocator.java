import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement e = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(e)).getText());
		
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		System.out.println(driver.findElement(with(By.tagName("input")).below(dob)).getAttribute("name"));
		
		WebElement check = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(check)).click();
		
		WebElement lb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(lb)).getText());

	}

}
