import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealTimeExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String val = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		
		
		WebElement e = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(e);
		s.selectByVisibleText(val);
		
		
		
		driver.findElement(By.id("name")).sendKeys(val);
		
		driver.findElement(By.id("alertbtn")).click();/*
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		driver.findElement(By.xpath("//input[@value='Alert']")).getText();
		//a.accept();*/
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		String s2 = a.getText();
		if(s2.contains(val)) {
			System.out.println("text is available");
		}
		else
			System.out.println("text is not available");
		a.accept();
		
		
	}

}
