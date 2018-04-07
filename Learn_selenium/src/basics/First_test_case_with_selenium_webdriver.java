package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_test_case_with_selenium_webdriver {

	public static void main(String[] args) throws InterruptedException {
		//Scenario to Automate

		//Launch the Firefox browser
		//Open website “www.fundsindia.com”
		//Print a Message to display that the website is opened successfully
		//Wait for 5 Seconds
		//Close the Browser
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.fundsindia.com");
		
		System.out.println("Succesfully opened FundsIndia Website");
		
		System.out.println();
		Thread.sleep(20);
		
		driver.quit();
		
	}

}
