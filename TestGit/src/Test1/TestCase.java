package Test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	
	@Test
	public void TC1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmnndha\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("gokulnanda996@rediffmail.com");
		driver.findElementById("pass").sendKeys("Nanda@2104");
		driver.quit();
	}
	
}
