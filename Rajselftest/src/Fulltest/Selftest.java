package Fulltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selftest {
	public static void main (String[] args) {
		System.setProperty("Webdriver.Chrome.driver", "C:\\New folder\\chrome driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
	   WebElement use = driver.findElement(By.id("username"));
	   use.sendKeys("Jayaram29");
	   
	   WebElement pass = driver.findElement(By.id("password"));
	   pass.sendKeys("Rajaj2995@");
	   
	   WebElement log = driver.findElement(By.id("login"));
	   log.click();
	  
	  WebElement loc = driver.findElement(By.id("location"));
	    Select sec = new Select (loc);
	    sec.selectByIndex(3);
	    
	    WebElement hot = driver.findElement(By.id("hotels"));
	Select sec1 = new Select(hot);
	sec1.selectByValue("Hotel Creek");
	
	WebElement type = driver.findElement(By.id("room_type"));
	Select room = new Select(type);
	room.selectByIndex(3);
	
	WebElement qty = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select num = new Select (qty);
	num.selectByIndex(5);
	
	
	
	
	    
	    
	    
	}
	
}
