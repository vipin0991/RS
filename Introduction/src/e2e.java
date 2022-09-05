import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delhi (DEL)' or @class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("de");
		//driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).sendKeys("ben");
		//driver.findElement(By.xpath("//div[text()='From']")).sendKeys("ben");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Indira Gandhi International Airport']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("che");
		driver.findElement(By.xpath("//div[text()='Chennai International Airport']")).click();
	
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(),'Departure Date')]")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(),'Departure Date')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and contains(text(),'25')])[1]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		for(int i=1;i<=4;i++) {
		
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa' and contains(text(),'one way')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Family') and @class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(), 'Currency')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and contains(text(),'USD')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79' and contains(text(),'Search Flight')]")).click();
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79' and contains(text(),'Search Flight')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79' and contains(text(),'Search Flight')]")).click();
		WebElement e = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79' and contains(text(),'Search Flight')]"));
		Actions a = new Actions(driver);
		a.moveToElement(e).click().perform();
	}

}
