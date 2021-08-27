package SeleniumBasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Shweta Choubey
 *
 */
public class ActionsClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.spicejet.com/");
Thread.sleep(10000);
/*
 * By
 * Login=By.xpath("//a[@id='ctl00_HyperLinkLogin' and text()='Login / Signup']"
 * ); By MemberLogin=By.
 * xpath("//li[@class='hide-mobile']/a[text()='SpiceClub Members']"); By
 * SignUp=By.xpath("//li[@class='hide-mobile']//a[text()='Sign up']");
 * WebElement target=driver.findElement(Login); String text = target.getText();
 * System.out.println(text); WebElement MemberLoginLocator =
 * driver.findElement(MemberLogin); WebElement SignUpLink =
 * driver.findElement(SignUp);
 * 
 * Actions action=new Actions(driver);
 * action.moveToElement(target).build().perform();; Thread.sleep(5000);
 * action.moveToElement(MemberLoginLocator).build().perform();
 * Thread.sleep(5000);
 * action.moveToElement(SignUpLink).click().build().perform(); driver.close();
 */
  String login="//a[@id='ctl00_HyperLinkLogin' and text()='Login / Signup']";
  String MenberLogin="//li[@class='hide-mobile']/a[text()='SpiceClub Members']";
  String sighUp="//li[@class='hide-mobile']//a[text()='Sign up']";
  actionsMethod(2,login,MenberLogin,sighUp);
  driver.close();
 	}
	
public static void actionsMethod(int index,String ...we1) throws InterruptedException
{
	Actions action=new Actions(driver);
	for(int i=0;i<we1.length;i++)
	{
		action.moveToElement(xPathValue(we1[i])).build().perform();	
		Thread.sleep(3000);
		if(i==index)
		{
			action.moveToElement(xPathValue(we1[i])).click().build().perform();	
		}
	}
	
}
public static WebElement xPathValue(String elementAddress)
{
	WebElement XpathElement = driver.findElement(By.xpath(elementAddress));
	return XpathElement;
	
}
}
