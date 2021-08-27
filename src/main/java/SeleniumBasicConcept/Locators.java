package SeleniumBasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver.get("https://login.salesforce.com/");
	
		By by = By.id("username");
	}

	public static void dosend(By locator, String val) {
		findElemt(locator).sendKeys(val);
	}

	public static void doClick(By locator) {
		findElemt(locator).click();
	}

	public static WebElement findElemt(By locator) {
		WebElement ele = driver.findElement(locator);
		return ele;

	}
}
