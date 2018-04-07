package basics;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.out.println("Successfully Opened Mercury Tours website");
  }

  @Test
  public void testMercury() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("REGISTER")).click();
    System.out.println("Successfully Clicked on REGISTER button");
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("Arpit");
    System.out.println("Now filling details as required");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("Agrawal");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("7030566688");
    driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userName")).sendKeys("agrwlarpi.ece@gmail.com");
    driver.findElement(By.name("address1")).clear();
    driver.findElement(By.name("address1")).sendKeys("Opp. Om Saraswati Shishu Mandir");
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("Chetgiri Colony");
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Chhatarpur");
    driver.findElement(By.name("state")).clear();
    driver.findElement(By.name("state")).sendKeys("MP");
    driver.findElement(By.name("postalCode")).clear();
    driver.findElement(By.name("postalCode")).sendKeys("471001");
    new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("arpit2012");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("11816920");
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("11816920");
    driver.findElement(By.name("register")).click();
    System.out.println("Filled all the details successfully \n Now signing in");
    driver.findElement(By.linkText("sign-in")).click();
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("arpit2012");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("11816920");
    driver.findElement(By.name("login")).click();
    System.out.println("Signed in successfully");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
