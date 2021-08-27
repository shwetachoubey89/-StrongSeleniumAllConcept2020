package SeleniumBasicConcept;

import org.openqa.selenium.By;

public class findElements extends BaseClass{
	public void login()
	{
By username=By.id("username_container");
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
	public static void main(String[] args) {
		
	}
	
}
