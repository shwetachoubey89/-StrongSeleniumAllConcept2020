package SeleniumBasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static	WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(1000);
	By username=By.id("username");
	By password=By.id("password");
	By loginBtn=By.id("Login");
	WebElementUtility webUtil=new WebElementUtility(driver);
	webUtil.findElemt(username);
	webUtil.dosend(username, "shdubey03@gmail.com");
	webUtil.findElemt(password);
	webUtil.dosend(password, "salesforce.com1");
	webUtil.findElemt(loginBtn);
	webUtil.doClick(loginBtn);

	String title = driver.getTitle();
	System.out.println("Login successfull, title of the page is "+ title);
}

}
