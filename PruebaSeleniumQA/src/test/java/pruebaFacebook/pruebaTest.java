package pruebaFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pruebaTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.close();
  }
}
