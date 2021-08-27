package SeleniumBasicConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeOptions {

	static ChromeOptions co;
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		co = new ChromeOptions();
		co.setHeadless(true);
		//co.addArguments("--headless");
		driver = new ChromeDriver(co);
		driver.get("https://login.salesforce.com/");
		driver.getTitle();
		System.out.println();

	}

}
