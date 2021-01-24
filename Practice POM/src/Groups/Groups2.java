package Groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups2 {

	 public String baseUrl = "http://automationpractice.com/index.php";
	    String driverPath = "chromedriver.exe";
	    String keyPath = "webdriver.chrome.driver";
	    public WebDriver Driver;
	    //private WebElement element;
	   
	@BeforeTest(groups = {"smoke0"})
	public void setup() {
	    System.out.println("launching browser");
	    System.setProperty(keyPath, driverPath);
	    Driver = new ChromeDriver();
	    Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	 }


	@Test(priority = 0, groups = {"smoke2"})
	public void getUrl() {
	Driver.manage().window().maximize();
	Driver.get(baseUrl);

	}

	@Test(priority = 0, groups = {"Smoke05"}, dependsOnMethods = {"getUrl"})
	public void verifyHomepageTitle() {
	    String expectedTitle = "My Store";
	    String actualTitle = Driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}


	 
	@Test(priority = 1, groups = {"Smoke06"}, dependsOnMethods = {"getUrl"})

	public void verifySigninPage() {
	Driver.findElement(By.xpath("//*[@class='login']")).click();
	String expectedURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	    String actualURL = Driver.getCurrentUrl();
	    Assert.assertEquals(actualURL, expectedURL);
	}

	@Test(priority = 2, groups = {"Smoke06"}, dependsOnMethods = {"verifySigninPage"})
	public void verifySignupForm() {
	    String expectedForm = "create-account_form";
	    String actualForm = Driver.findElement(By.cssSelector("#create-account_form")).getAttribute("id");
	    Assert.assertEquals(actualForm, expectedForm);
	}

	@Test(priority = 3, groups = {"Smoke5"})
	public void verifyAuthentificForm() {
	String expectedForm = "login_form";
	    String actualForm = Driver.findElement(By.cssSelector("#login_form")).getAttribute("id");
	    Assert.assertEquals(actualForm, expectedForm);
	}


	@AfterTest(alwaysRun = true)
	public void closeBrowser(){
	    Driver.close();
	}
}
