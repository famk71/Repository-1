package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_factory.Sign_in_form_Automation_practice;

public class Page_Factory_Sign_in_automation_practice {

	WebDriver Driver;
	
	Sign_in_form_Automation_practice X;
	
	@BeforeTest public void Setup() {
		
	Driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Driver.get("http://automationpractice.com/index.php");
	X= new Sign_in_form_Automation_practice(Driver);
	}
	
	@Test public void Checktitle() {

		X.Mainpagetitle();
		Assert.assertEquals(X.Mainpagetitle(), "My Store");
		System.out.println(X.Mainpagetitle());
		
		X.Openloginpage();
		X.Signinpagetitle();
		Assert.assertEquals(X.Signinpagetitle(), "Login - My Store");
		System.out.println(X.Signinpagetitle());

	}
}
