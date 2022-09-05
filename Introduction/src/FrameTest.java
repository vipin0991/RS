import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		//WebElement fr = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.findElement(By.id("draggable")).click();
		Actions ac= new Actions(driver);
		WebElement source  = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, target).build().perform();	
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Accept")).click();
		

	}

}
