package pages;
import org.openqa.selenium.By;

import base.BaseClass;
public class HomePage extends BaseClass{
	private By oLogout = By.xpath("//a[text()='Logout']");
	
	public boolean VerifyElement() {
		if(driver.findElement(oLogout).isDisplayed()) {		 
			return true;
		}else {
			return false;
		}
	}
	
	public LoginPage logout() {
		driver.findElement(oLogout).click();
		return new LoginPage();
	}
}
