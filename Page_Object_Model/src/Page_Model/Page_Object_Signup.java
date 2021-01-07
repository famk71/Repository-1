package Page_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Page_Object_Signup {
	WebDriver driver;
	
	
	By EmailAddress = By.xpath("//input[@name='email_create']");
	By CreateanAccount = By.xpath("//i[@class='icon-user left']");
	By Mr = By.xpath("//input[@id='id_gender1']");
	By Mrs = By.id("id_gender2");
	By FirstName = By.cssSelector("input[id='customer_firstname']");
	By LastName = By.cssSelector("[id*='customer_lastname']");
	By PassWord = By.cssSelector("[id*='passwd']");
	By Days = By.cssSelector("#days");
	By Months = By.cssSelector("#months");
	By Years = By.cssSelector("#years");
	By newsLettercheck = By.cssSelector("#newsletter");
	By specialOffers = By.xpath("//input[contains(@id,'opt')]");  
	By Company = By.xpath("//input[contains(@id,'com')]");
	By Address = By.cssSelector("input.form-control[id='address1']");
	By City = By.cssSelector("#city");
	By State = By.cssSelector("select[id*='_state']");
	By ZipPostalCode =By.cssSelector("#postcode");
	By Country = By.cssSelector("select[id$='ntry']");
	By AdditionalInformation =By.cssSelector("#other");
	By Homephone = By.cssSelector("#phone");
	By Mobilephone = By.cssSelector("#phone_mobile");
	By Assignanaddress =By.cssSelector("#alias");
	
	
	public Page_Object_Signup(WebDriver Driver) {
		this.driver= Driver;   		//This is the class constructor	
	}
	
	
	public String createaccountpage() {
		return driver.getTitle();       						   	 //This method returns a String value
	}
	
	
	public void Email(String email)  {
		driver.findElement(EmailAddress).sendKeys(email);			//This is a VOID method and returns No Value
	}
	
	public void ClickCreatebutton()  {
		driver.findElement(CreateanAccount).click();				//This is a VOID method and returns No Value
	}
	
	public void GenderMR()  {
		driver.findElement(Mr).click();}
	
	public void GenderMRS() {
		driver.findElement(Mrs).click();
	}
	
	public void Fname(String fname)  {
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void Lname(String lname)  {
		driver.findElement(LastName).sendKeys(lname);
	}
	
	
	public void Password(String password)  {
		driver.findElement(PassWord).sendKeys(password);
	}
	
	public void Day(int day)  {
		WebElement Selectdays= driver.findElement(Days);
		Selectdays.click();
		Select sinput =new Select(Selectdays);
		sinput.selectByIndex(day);
	}
	
	public void Months(int month)  {
		WebElement Selectmonth= driver.findElement(Months);
		Selectmonth.click();
		Select sinput= new Select(Selectmonth);
		sinput.selectByIndex(month);
	}
	
	public void Years(String year)  {
		WebElement Selectyear= driver.findElement(Years);
		Selectyear.click();
		Select sinput =new Select(Selectyear);
		sinput.selectByValue(year);
	}
	public void Newsletterheck() { 
	driver.findElement(newsLettercheck).click();
	}
	
	public void Specialclick() {
		driver.findElement(specialOffers).click();
	}
	
	public void Company(String company)  {
		driver.findElement(Company).sendKeys(company);
	}
	
	public void Address(String address)  {
		driver.findElement(Address).sendKeys(address);
	}
	
	public void City(String city)  {
		driver.findElement(City).sendKeys(city);
	}
	
	public void State(String state) {
		WebElement Selectstate= driver.findElement(State);
		Selectstate.click();
		Select sinput= new Select(Selectstate);
		sinput.selectByValue(state);
		}	
	
	public void ZipPostalCode(String zip) {
		driver.findElement(ZipPostalCode).sendKeys(zip);
		}
	
	public void Country(String country) {
	WebElement Selectcountry= driver.findElement(Country);
	Selectcountry.click();
	Select sinput= new Select(Selectcountry);
	sinput.selectByValue(country);
	}
	
	public void AdditionalInformation(String additional) {
		driver.findElement(AdditionalInformation).sendKeys(additional);
	}
	
	
	public void Homephone(String homephone) {
		driver.findElement(Homephone).sendKeys(homephone);
	}
	
	public void Mobilephone(String mobilephone) {
		driver.findElement(Mobilephone).sendKeys(mobilephone);
	}
	
	public void Assignanaddress(String assignaddress) {
		driver.findElement(Assignanaddress).clear();
		driver.findElement(Assignanaddress).sendKeys(assignaddress);
	}
	

	public void Signuppage(String email,String fname, String lname, String password,int day,int month,String year, String company,String address, String city,
			String state,String zip,String country, String aditional, String homephone,String mobilephone, String assignaddress) {
		
		
		this.Email(email);
		this.ClickCreatebutton();
		
		//this.GenderMR();
		this.GenderMR();
		this.Fname(fname);
		this.Lname(lname);
		this.Password(password);
		this.Day(day);
		this.Months(month);
		this.Years(year);
		this.Newsletterheck();
		this.Specialclick();
		this.Company(company);
		this.Address(address);
		this.City(city);
		this.State(state);
		this.ZipPostalCode(zip);
		this.Country(country);
		this.AdditionalInformation(aditional);
		this.Homephone(homephone);
		this.Mobilephone(mobilephone);
		this.Assignanaddress(assignaddress);
		
		
		
		//this.Country();
		
		
		
		
		
		
		
		
		
	
	}
	
}



