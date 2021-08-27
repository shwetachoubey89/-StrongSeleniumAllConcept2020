package SeleniumBasicConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta Choubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://github.com/bonigarcia/webdrivermanager");



//https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html
//https://www.selenium.dev/selenium/docs/api/java/

	}

}
