package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {

	@Test(priority=2)
	public void login() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
		Select sele = new Select(element);
		sele.selectByIndex(2);
driver.close();
	}
	
	@Test(priority=1)
	public void login2() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "Drivers//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.close();
	}

}
