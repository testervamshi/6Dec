package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage{

	public SigninPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//input[@type='email']")
	WebElement txt_username;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement txt_password;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement btn_login;
	
	public void setUsername(String uname) {
		txt_username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btn_login.click();
	}

}
