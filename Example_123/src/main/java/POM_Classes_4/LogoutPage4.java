package POM_Classes_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage4 {
@FindBy(xpath="//button[contains(text(),'Sign out')]")private WebElement logotubtn;
public LogoutPage4(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void logoutbtn2() {
	logotubtn.click();
}
}
