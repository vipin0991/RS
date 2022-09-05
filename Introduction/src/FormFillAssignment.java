import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("vipin dhiman");
		driver.findElement(By.name("email")).sendKeys("vipin.dhiman21@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshetty@123");
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		
		WebElement dp = driver.findElement(By.id("exampleFormControlSelect1"));
		Select op = new Select(dp);
		op.selectByVisibleText("Male");
		//op.selectByValue("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("21/09/1988");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		

	}

}
