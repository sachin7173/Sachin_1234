package POM_Classes_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 {
	@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//input[@name='commit']")private WebElement loginbtn;
	public LoginPage4(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void username23(String username) {
		UN.sendKeys(username);
	}
	public void Password2(String password) {
	PWD.sendKeys(password);		
	}
	public void loginbtn2() {
		loginbtn.click();
	}
}
