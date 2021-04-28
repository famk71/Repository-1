package Parameter;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Data_Provider {
WebDriver Driver;
	
	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\famk1\\eclipse-workspace\\Practice Automation\\chromedriver\\chromedriver.exe");
	Driver = new ChromeDriver();
	//driver = new FirefoxDriver();
	Driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	Driver.manage().window().maximize();
	Driver.get("https://google.com");
	}
	
	 @Test(priority=0)
	    public void testNoParameter() throws InterruptedException{
	        String author = "guru99";
	        String searchKey = "india";
	        
	       
	        
	       
	        WebElement searchText = Driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(searchKey);
	        
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	                System.out.println("Thread will sleep now");
	        
	        Thread.sleep(3000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	        //verifying the value in google search box
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	        searchText.clear(); }
	 @Test(priority=1)
	 @Parameters({"author","searchKey"})
	    public void testParameterWithXML( @Optional("Abc") String author,@Optional("Mexico") String searchKey) throws InterruptedException{

		 
		 
	        WebElement searchText = Driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(searchKey);

	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        System.out.println("Thread will sleep now");
	        Thread.sleep(3000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	        //verifying the value in google search box
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	        searchText.clear();
	 }
	 @Test(dataProvider="SearchProvider", priority=2)
	    public void testMethodA(String author,String searchKey) throws InterruptedException{
	    {
	        WebElement searchText = Driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Thread.sleep(3000);
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	    }
	    }
	 
	 @Test(dataProvider="SearchProvider", priority=3)
	 public void testMethodB(String searchKey) throws InterruptedException{
	 {
		 	WebElement searchText = Driver.findElement(By.name("q"));
		 	//Search text in search box
		 	searchText.sendKeys(searchKey);
		 	//Print only search string
		 	System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
		 	Thread.sleep(3000);
		 	String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey);
			searchText.clear();
			//Verify if google text box is showing correct value
			Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	 }}
	 
	 @Test(dataProvider="SearchProvider", priority=4)
	 public void testMethodC(String searchKey) throws InterruptedException{
	 {
		 	WebElement searchText = Driver.findElement(By.name("q"));
		 	//Search text in search box
		 	searchText.sendKeys(searchKey);
		 	//Print only search string
		 	System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
		 	Thread.sleep(3000);
		 	String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey);
			searchText.clear();
			//Verify if google text box is showing correct value
			Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	 }}
	 @DataProvider(name="SearchProvider")
	 public Object[][] getDataFromDataprovider(Method m){
		 
		 if(m.getName().equalsIgnoreCase("testMethodA")) {
			 
		 
	        return new Object[][]
	        {
	        { "Guru99", "India" },
	        { "Krishna", "UK" },
	        { "Bhupesh", "USA" }
	        };}

		 else {return new Object[][]
			        {
		        { "Canada" },
		        { "Japan"  },
		        { "Uganda" }
		        };}
		 
	 }
	 @DataProvider(name="SearchProvider")
		 public Object [][] getDataFromDataprovider2(ITestContext C){
		 Object[][] groupArray = null;
		 for (String group : C.getIncludedGroups()) {
			 if(group.equalsIgnoreCase("A")){
			 groupArray = new Object[][] {
			 { "Guru99", "India" },
			 { "Krishna", "UK" },
			 { "Bhupesh", "USA" }
			 };
			 break;
			 }
			 else if(group.equalsIgnoreCase("B"))
			 {
			 groupArray = new Object[][] {
			 { "Canada" },
			 { "Russia" },
			 { "Japan" }
			 };
			 }
			 break;
			 }
			 return groupArray;
			 }
		 
		 
	}	 


