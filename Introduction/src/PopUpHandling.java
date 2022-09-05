import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void getScreenshot(WebDriver driver) {
		System.out.println("Hi");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String user = "Vipin";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys(user);
		Thread.sleep(2000);
 		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);

		Alert a1 = driver.switchTo().alert();
		String txt = driver.switchTo().alert().getText();
		String[] s = txt.split(" ");
		for (String s1 : s) {
			System.out.println(s1);
		}
		getScreenshot(driver);
		System.out.println(txt);
		a1.accept();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
		
	}

}
