package pruebaFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pruebaTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.instagram.com");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		driver2.close();
  }
}
