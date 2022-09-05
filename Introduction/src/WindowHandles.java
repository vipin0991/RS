import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		  Set<String> window = driver.getWindowHandles(); 
		  Iterator<String> it =  window.iterator(); 
		  String parentId = it.next(); 
		  String childId = it.next();
		  
		 driver.switchTo().window(childId);
		 String em="";
		
		 String m  = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		/*
		 * for(int i=0;i<m.length;i++) { //System.out.println("##"+m[i]);
		 * if(m[i].equals("mentor@rahulshettyacademy.com")) { em = m[i]; break; } }
		 */
		 driver.switchTo().window(parentId);
		 driver.findElement(By.id("username")).sendKeys(m);
		 
		 
	

	}

}
