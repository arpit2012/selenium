package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_browser_commands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String URL = "http://www.store.demoqa.com";
		driver.get(URL);
		
		String Title = driver.getTitle();
		int lengthOfTitle=driver.getTitle().length();
		
		System.out.println("Title of the webpage is: " +Title +" and its lenght is: " +lengthOfTitle);
		
		String OpenedURL = driver.getCurrentUrl();
		
		if (OpenedURL.equals(URL)){
			System.out.println("Verificatoin of URL successful.");
		}else{
			System.out.println("Verification failed");
			System.out.println("Actual URL: " +URL);
			System.out.println("Opened URL: " +OpenedURL);
		}
		
		String pageSource=driver.getPageSource();
		int pageSourceLength=driver.getPageSource().length();
		System.out.println("Total length of page source is: " +pageSourceLength);
		
		driver.close();
	}

}
