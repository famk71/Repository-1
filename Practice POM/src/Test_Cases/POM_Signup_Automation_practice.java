package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object_Model.POM_Sign_in_form_Automation_Practice;
import Page_Object_Model.POM_Sign_up_form_Automation_practice;

public class POM_Signup_Automation_practice {

	WebDriver Driver;
	
	POM_Sign_in_form_Automation_Practice X;
	POM_Sign_up_form_Automation_practice Y;
	
	@BeforeTest public void Setup(){
		Driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.get("http://automationpractice.com/index.php");
		X= new POM_Sign_in_form_Automation_Practice(Driver);
		Y= new POM_Sign_up_form_Automation_practice(Driver);
	}
	
	@Test public void Signinpage() {
		X.Homepagetitle();
		Assert.assertEquals(X.Homepagetitle(), "My Store");
		System.out.println(X.Homepagetitle());
		X.Sign_in_page();
		}
	
	@Test public void Signuppage() {
		Y.Signupform("famk17@yahoo.com", "Masud", "Ali", "Ali1122", "3", 4, "1971", "Express", "Khilgao", "130/B", "Dhaka", "1", "11234", "kjhan", "9294523", "53364", "Nothing much");
	}
}
