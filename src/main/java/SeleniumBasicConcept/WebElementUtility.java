package SeleniumBasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementUtility {

	WebDriver driver;
	public WebElementUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void dosend(By locator, String val) {
		findElemt(locator).sendKeys(val);
	}

	public  void doClick(By locator) {
		findElemt(locator).click();
	}

	public  WebElement findElemt(By locator) {
		WebElement ele = driver.findElement(locator);
		return ele;

	}
	//Actions Method
	public  void actionsMethod(int index,String ...we1) throws InterruptedException
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
	//Actions Method
	public  WebElement xPathValue(String elementAddress)
	{
		WebElement XpathElement = driver.findElement(By.xpath(elementAddress));
		return XpathElement;
		
	}
}
