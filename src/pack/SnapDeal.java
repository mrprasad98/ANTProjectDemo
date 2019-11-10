package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SnapDeal {
@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(3000);
	driver.get("https://www.snapdeal.com");
	Thread.sleep(3000);
	driver.close();
}
}
