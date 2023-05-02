package Test_Classes4;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Classes_4.BaseClass4;
import POM_Classes_4.HomePage4;
import POM_Classes_4.LoginPage4;
import POM_Classes_4.LogoutPage4;
import POM_Classes_4.SigninPage4;
import POM_Classes_4.UtilityClass4;

public class Test_Class1 extends BaseClass4{
SigninPage4 signin;
LoginPage4 login;
HomePage4 home;
LogoutPage4 logout;

@BeforeClass
public void openBrowser2() throws IOException, InterruptedException {
	openBrowser();
	signin =new SigninPage4(driver);
	login =new LoginPage4(driver);
	home =new HomePage4(driver);
	logout =new LogoutPage4(driver);
	
}
@BeforeMethod
public void login2() throws IOException, InterruptedException {
	signin.signinbtn2();
	login.username23(UtilityClass4.getPropertyFile("username"));
	login.Password2(UtilityClass4.getPropertyFile("password"));
	login.loginbtn2();
	Thread.sleep(2000);
	home.accountbtn2();
	
}
@Test
public void verifyusername2() throws IOException {
String expResult = UtilityClass4.getPropertyFile("username1");
String actResult = home.verifyusername2();
SoftAssert soft=new SoftAssert();
soft.assertEquals(actResult, expResult,"act and exp result is different");
soft.assertAll();
}
@AfterMethod
public void logout2(ITestResult result) throws IOException, InterruptedException {
if(result.getStatus()==ITestResult.FAILURE) {
	int TCID=876;
	UtilityClass4.CaptureScreenshot(driver, TCID);
	Thread.sleep(2000);
}
logout.logoutbtn2();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
