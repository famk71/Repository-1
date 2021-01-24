package Test_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Model.Page_Object_Signin;

public class Page_Model_Signin_Test {

	WebDriver Driver= new ChromeDriver();
	Page_Object_Signin X;
	Page_Object_Signin Y;
@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String URL1 = ("http://automationpractice.com/index.php");
	Driver.get(URL1);
	Y=new Page_Object_Signin(Driver);
	}

@Test
public void OpenSignInPage() {
	
	String MainpageTitle= Y.MainpageTitle();
	Assert.assertTrue(MainpageTitle.contains("My Store"));
	System.out.println(MainpageTitle);
	Y.Opensinginpage();
	
}
}
