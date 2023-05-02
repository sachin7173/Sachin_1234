package POM_Classes_4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass4 {
	
	
public static WebDriver driver;
public static void openBrowser() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\Example_123\\src\\test\\resources\\Browsers\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
 option.addArguments("--disable-notifications");
 driver=new ChromeDriver(option);
 
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 driver.get(UtilityClass4.getPropertyFile("url"));
 Thread.sleep(2000);
 
}
}
