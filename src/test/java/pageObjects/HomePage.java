package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//a[text()='Sign in']")
	WebElement btn_signin;
	
	public void click_Signin() {
		btn_signin.click();
	}
	
	public void titleVerify() {
		String act_url="https://products.ncryptedprojects.com/petsitcare/";
		String exp_url=driver.getCurrentUrl();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(act_url, exp_url);
		sa.assertAll();
	}

}
