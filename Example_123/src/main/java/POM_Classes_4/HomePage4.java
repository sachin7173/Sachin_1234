package POM_Classes_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage4 {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement accountbtn;
	@FindBy(xpath="//strong[text()='sachin7173']")private WebElement verifyusername;
	public HomePage4(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void accountbtn2() {
		accountbtn.click();
	}
	public String verifyusername2() {
		String actResult = verifyusername.getText();
		return actResult;
		
	}
}
