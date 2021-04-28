package Test_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Model.Page_Object_Signup;
import io.github.bonigarcia.wdm.WebDriverManager;
import Page_Model.Page_Object_Signin;

public class Page_Model_SIGNUP_Test {
	
	
	WebDriver Driver;
	//Page_Object_Singin X;
	Page_Object_Signin Y;
	Page_Object_Signup Z;
	
@BeforeTest
	public void Setup() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String URL1 = ("http://automationpractice.com/index.php");
	Driver.get(URL1);
	Y= new Page_Object_Signin(Driver);
	Z= new Page_Object_Signup(Driver);
	}

@Test (priority= 0)
public void OpenSignInPage() {
	String MainpageTitle= Y.MainpageTitle();
	Assert.assertTrue(MainpageTitle.contains("My Store"));
	System.out.println(MainpageTitle);
	Y.Opensinginpage();
	
}

@Test (priority= 1)

public void OpenSignUpPage() {
	Z.Signuppage("fmak@gmail.com","AK","Kh","sdskjds", 13, 5, "1971", "company", "1982 skdkw", "brooklyn", "53", "112588", "21", "sdsd", "+552", "+2586", "asdklsad");
}

}
