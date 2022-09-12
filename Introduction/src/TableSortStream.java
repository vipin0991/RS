import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		System.setProperty("webdriver.chrome.driver","../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		List<WebElement> e = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orig = e.stream().map(s->s.getText()).collect(Collectors.toList());
		for(String s : orig) {
			System.out.println(s);
		}
		System.out.println("*******");
		List<String> orSort = orig.stream().sorted().collect(Collectors.toList());
		for(String s1 : orSort) {
			System.out.println(s1);
		}
			//Assert.assertTrue(orig.equals(orSort));
		List<String> pr;
			//Scan the name column with getText -> Beans -> Print the price
			do {
				List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
				
				pr = row.stream().filter(s->s.getText().contains("Carrot"))
			.map(s->getprice(s)).collect(Collectors.toList());
			pr.forEach(s->System.out.println(s));
			
			if(pr.size()<1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
			}while(pr.size()<1);

	}

	private static String getprice(WebElement e) {
		// TODO Auto-generated method stub
		String val = e.findElement(By.xpath("following-sibling::td[1]")).getText();
		return val;
	}

}
