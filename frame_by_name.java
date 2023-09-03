package A_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame_by_name {
	
	WebDriver driver;
  @Test
  public void samp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	  
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  driver.switchTo().frame("Google_ContactForm");
	  driver.findElement(By.id("fname")).sendKeys("Madhu");
	  driver.findElement(By.id("lname")).sendKeys("smitha");
	  driver.findElement(By.id("subject1")).sendKeys("hello selenium");
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame("Amazon_ContactForm");
	  driver.findElement(By.id("fname")).sendKeys("koshal");
	  driver.findElement(By.id("lname")).sendKeys("shanmukh");
	  driver.findElement(By.id("subject")).sendKeys("hello class");
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
