package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Navigation_commands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.DemoQA.com");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.DemoQA.com");
		driver.navigate().refresh();
		driver.quit();
	}

}
