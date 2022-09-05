import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		/*for(int i=0;i<=2;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		*/
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//div[contains(text(),'Senior Citizen') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).isSelected());
		driver.findElement(By.xpath("//div[contains(text(),'Family') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Family') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).isEnabled());
		
		//driver.findElement(By.xpath("//div[contains(text(),'Senior Citizen') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).click();
		//System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Senior Citizen') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).isEnabled());
		//driver.findElement(By.xpath("(//div[contains(text(),'Family')])[1]")).click();
		int d= driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size();
		System.out.println(d);
		Assert.assertEquals(driver.findElements(By.cssSelector("div[class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).size(), 8);
	}

}
