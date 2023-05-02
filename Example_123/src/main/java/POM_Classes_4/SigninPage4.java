package POM_Classes_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage4 {
	@FindBy(xpath="//a[contains(text(),'Sign in')]")private WebElement signinbtn;
	public SigninPage4(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void signinbtn2() {
		signinbtn.click();
	}
}
