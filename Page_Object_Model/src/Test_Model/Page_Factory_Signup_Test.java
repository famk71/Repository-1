package Test_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Factory.Sign_Up_Form;
import Page_Factory.Sign_in_form;

public class Page_Factory_Signup_Test {
	WebDriver Driver;
	Sign_in_form X;
	//Sign_Up_Form Y;
	Sign_Up_Form Z;
	
@BeforeTest
	public void Setup() {
	Driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String URL1 = ("http://automationpractice.com/index.php");
	Driver.get(URL1);
	X=new Sign_in_form(Driver);
	Z= new Sign_Up_Form(Driver);
}

@Test
public void OpenSignInPage() {
	//X.MainpageTitle();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String MainPageTitle= X.MainpageTitle();
	Assert.assertTrue(MainPageTitle.contains("My Store"));
	System.out.print(MainPageTitle);
	
	X.Opensinginpage();
//	X.SigninPageTitle();
	String SigninPageTitle= X.SigninPageTitle();// Y.MainpageTitle();
	Assert.assertTrue(SigninPageTitle.contains("Login - My Store"));
	System.out.print(SigninPageTitle);
	
}
@Test

public void OpenSignUpPage() {
	Z.Signuppage("fmak@gmail.com","AK","Kh","sdskjds", "13", 5, "1971", "company", "1982 skdkw", "brooklyn", "53", "112588", "21", "sdsd", "+552", "+2586", "asdklsad");
}

}
