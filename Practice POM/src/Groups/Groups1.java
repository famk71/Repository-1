package Groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups1 {
	public String baseUrl = "http://automationpractice.com/index.php";
    //public String driverPath = "chromedriver.exe";
    public WebDriver Driver;
    
    
    @BeforeTest(groups = {"smoke0"})
    public void setup() {
    	System.out.println("Launching browser");
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	Driver=new ChromeDriver();
    	Driver.manage().window().maximize();
    	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
    }
    
    
    @Test (priority= 0, groups= {"smoke2"})
    public void getUrl() {
    	Driver.get(baseUrl);
    }
    
    @Test (priority= 1)
    	public void fillingSignupForm1() throws InterruptedException {
    	Thread.sleep(6000);
    	WebElement Signin = Driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
    	Signin.click();
    	
    	String expectedURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    	String expectedURL1 = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    	String actualURL = Driver.getCurrentUrl();
    	
    	
    	//String expectedURL1 = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    	//Assert.assertEquals(actualURL, expectedURL1);
    	
    	if (expectedURL == actualURL) {
    		Assert.assertFalse(actualURL == "http://automationpractice.com/index.php?controller=authentication&back=my-account", "False");
    		System.out.println("Assert passed for Sign in");
    		System.out.println(actualURL);
    	}
    	else {
    		System.out.println("Assert Failed for Sign in");
    	}
    
    WebElement EmailAddress = Driver.findElement(By.xpath("//*[@name='email_create']"));
    WebElement CreateanAccount =  Driver.findElement(By.xpath("//*[@id='SubmitCreate']"));


    EmailAddress.sendKeys("bigbertha@yahoo.com");
    String expectedForm = "email_create";
    String actualForm = Driver.findElement(By.xpath("//*[@name='email_create']")).getAttribute("name");
    Assert.assertEquals(actualForm, expectedForm);

    CreateanAccount.click();
    String expectedForm1 = "SubmitCreate";
    String actualForm1 = Driver.findElement(By.xpath("//*[@id='SubmitCreate']")).getAttribute("id");
    Assert.assertEquals(actualForm1, expectedForm1);


    WebElement Mr = Driver.findElement(By.xpath("//input[@id='id_gender1' and @value='1']"));
    WebElement Mrs = Driver.findElement(By.xpath("//input[@id='id_gender2' and @value='2']"));
    WebElement FirstName = Driver.findElement(By.cssSelector("input[id='customer_firstname']"));
    WebElement LastName = Driver.findElement(By.cssSelector("[id*='customer_lastname']"));
    WebElement PassWord = Driver.findElement(By.cssSelector("[id*='passwd']"));
    WebElement Days = Driver.findElement(By.cssSelector("[id*='days']"));
    WebElement month = Driver.findElement(By.cssSelector("[id*='month']"));
    WebElement year = Driver.findElement(By.cssSelector("#years"));
    WebElement newsLettercheck = Driver.findElement(By.cssSelector("#newsletter"));
    WebElement specialOffers = Driver.findElement(By.xpath("//input[contains(@id,'opt')]"));  
    WebElement Company = Driver.findElement(By.xpath("//input[contains(@id,'com')]"));
    WebElement Address = Driver.findElement(By.cssSelector("input.form-control[id='address1']"));
    WebElement City = Driver.findElement(By.cssSelector("#city"));
    WebElement State = Driver.findElement(By.cssSelector("select[id*='_state']"));
    WebElement ZipPostalCode = Driver.findElement(By.cssSelector("#postcode"));
    WebElement Country = Driver.findElement(By.cssSelector("select[id$='ntry']"));
    WebElement AdditionalInformation = Driver.findElement(By.cssSelector("#other"));
    WebElement Homephone = Driver.findElement(By.cssSelector("#phone"));
    WebElement Mobilephone = Driver.findElement(By.cssSelector("#phone_mobile"));
    WebElement Assignanaddress = Driver.findElement(By.cssSelector("#alias"));





    Mr.click();
    Assert.assertEquals(true, Mr.isSelected());
    Assert.assertEquals(false, Mrs.isSelected());
    System.out.println("Radio button Mr is selected – Assert passed");
    System.out.println("Radio button Mrs is not selected – Assert passed");


    FirstName.sendKeys("Chris");
    System.out.println(FirstName.getAttribute("value"));

    LastName.sendKeys("Doris");
    Assert.assertEquals(true, LastName.isDisplayed());
    System.out.println(LastName.getAttribute("value"));

    PassWord.sendKeys("jkl456");
    System.out.println(PassWord.getAttribute("value"));

    Days.click();
    Select days = new Select(Days);
    days.selectByValue("15");
    System.out.println(days.getFirstSelectedOption().getText());

    Select months = new Select(month);
    months.selectByValue("9");
    System.out.println(months.getFirstSelectedOption().getText());

    Select years = new Select(year);
    years.selectByValue("1992");
    String option = years.getFirstSelectedOption().getText();
    Assert.assertEquals("1992  ", option);
    System.out.println(option);

     newsLettercheck.click();
     
     	String expectedForm2 = "checkbox";
        String actualForm2 = newsLettercheck.getAttribute("type");
        Assert.assertEquals(actualForm2, expectedForm2);
        System.out.println(actualForm2);
         
        specialOffers.click();
        Assert.assertEquals(true,specialOffers.isSelected());
        
       
       
        Company.sendKeys("Ltec");
        String expected = "Ltec";
        String actual = Driver.findElement(By.xpath("//input[contains(@id,'com')]")).getAttribute("value");
        Assert.assertEquals(actual, expected);
        System.out.println(actual);
       
       
        Address.sendKeys("186 Crescent");
        Assert.assertEquals("186 Crescent", Driver.findElement(By.cssSelector("input.form-control[id='address1']")).getAttribute("value"));
       
       
        City.sendKeys("buffalo");
        String cityValue = Driver.findElement(By.cssSelector("#city")).getAttribute("value");
        Assert.assertEquals("buffalo", cityValue);
        System.out.println(cityValue);
       
       
        Select sinput4 = new Select(State);
    sinput4.selectByValue("53");
    String option1 = sinput4.getFirstSelectedOption().getText();
    Assert.assertEquals("District of Columbia", option1);
       
       
       
        ZipPostalCode.sendKeys("11315");
       
        String zipValue = Driver.findElement(By.cssSelector("#postcode")).getAttribute("value");
        Assert.assertEquals("11315", zipValue);
       
       
       
        Country.click();
        Select sinput5 = new Select(Country);
    String option2 = sinput5.getFirstSelectedOption().getText();
    Assert.assertEquals("United States", option2);
       
       
        AdditionalInformation.sendKeys("otherinfo");
       
        AdditionalInformation.sendKeys("Extrainfo");
        Assert.assertEquals(true, AdditionalInformation.isDisplayed());
       
       
       
        Homephone.sendKeys("5142806539");
        Assert.assertEquals(true, AdditionalInformation.isDisplayed());
        String homphoneValue = Driver.findElement(By.cssSelector("#phone")).getAttribute("value");
        Assert.assertEquals("5142806539",homphoneValue);
       
       
        Mobilephone.sendKeys("8134568520");
        Assert.assertEquals(true, Mobilephone.isEnabled());
        String MobileValue = Driver.findElement(By.cssSelector("#phone_mobile")).getAttribute("value");
        Assert.assertEquals("8134568520", MobileValue);
       
        //WebElement Assignanaddress = driver.findElement(By.cssSelector("#alias"));
        int Assignanaddressverf = Driver.findElements(By.xpath("//input[@type='text' and @id='alias']")).size();

        if (Assignanaddressverf==1) {

        System.out.println("verified");

        }
        Assignanaddress.sendKeys("157");
        Driver.navigate().refresh();
    }    




    @Test(dependsOnMethods = {"fillingSignupForm1"} )
        public void quit() {
        Driver.close();

    }
}
