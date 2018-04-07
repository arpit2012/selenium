package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.com");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		
		driver.quit();
		

	}

}
