import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(2000);
		int count = driver.findElements(By.xpath("//span[contains(@aria-label,\"September\")]")).size();
		//System.out.println("********"+count);
		//span[@class='flatpickr-next-month'] /*[local-name()='svg']
		//driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("April");
		while(!driver.findElement(By.xpath("//span[@class='cur-month']")).getText().contains("April")) {
			System.out.println(driver.findElement(By.xpath("//span[@class='cur-month']")).getText());
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month'] /*[local-name()='svg']")).click();
		}
		
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//span[contains(@aria-label,\"April\")]"));
		Thread.sleep(2000);
		for(int i=0;i<count;i++) {
			String str = driver.findElements(By.xpath("//span[contains(@aria-label,\"April\")]")).get(i).getText();
			//System.out.println("^^^^^^^"+str);
			//Thread.sleep(2000);
			if(str.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//span[contains(@aria-label,\"April\")]")).get(i).click();

	}
}
	}
}

