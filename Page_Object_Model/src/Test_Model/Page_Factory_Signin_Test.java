package Test_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Factory.Sign_in_form;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_Factory_Signin_Test {
	WebDriver Driver;
	Sign_in_form Y;
	
	
	
@BeforeTest
	public void Setup() {
	WebDriverManager.chromedriver().setup();
	Driver= new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String URL1 = ("http://automationpractice.com/index.php");
	Driver.get(URL1);
	Y=new Sign_in_form(Driver);
	}

@Test
public void OpenSignInPage() {
	String MainPageTitle= Y.MainpageTitle();
	Assert.assertEquals(MainPageTitle,"My Store");
	System.out.print(MainPageTitle);
	
	
	Y.Opensinginpage();
	String SigninPageTitle= Y.SigninPageTitle();// Y.MainpageTitle();
	Assert.assertTrue(SigninPageTitle.contains("Login - My Store"));
	System.out.print(SigninPageTitle);
	
	
}

}
