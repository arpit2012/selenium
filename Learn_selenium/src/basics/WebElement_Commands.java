package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Commands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Defining an WebElement and Use of By.id
		WebElement ID = driver.findElement(By.id("Username"));
		
		//Clear Command
		
		ID.clear();
		//OR
		driver.findElement(By.id("Username")).clear();
		
		//SendKeys Command
		
		ID.sendKeys("ToolsQA");
		//OR
		driver.findElement(By.id("Username")).sendKeys("ToolsQA");
		
		//User of By.linkText(args)
		WebElement Link = driver.findElement(By.linkText("Login"));
		
		
		//Click Command
		
		Link.click();
		//OR
		driver.findElement(By.linkText("Login")).click();
		
		//isDisplayed Command
		
		WebElement Display = driver.findElement(By.id("UserName"));
		boolean status = Display.isDisplayed();
		//OR
		boolean status2 = driver.findElement(By.id("UserName")).isDisplayed();
		
	}

}
