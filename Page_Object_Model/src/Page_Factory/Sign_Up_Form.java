package Page_Factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sign_Up_Form {
	
	WebDriver Driver;
	
	@FindBy(how= How.ID, using ="email_create")
	WebElement EmailAddress;
	
	@FindBys({							
	@FindBy(xpath="//i[@class='icon-user left']")})
	List<WebElement> CreateanAccount;			//this is for listing element, Where more than one button to click in the same place
	
	@FindBy(css="#id_gender1")
	WebElement Mr;
	@FindBy(css="#id_gender2")
	WebElement Mrs;
	
	@FindAll({
	@FindBy(css="#customer_firstname")}) 		//This continues executing if it doesn't find any of the element and log it
	List<WebElement> FirstName;
	
	
	@FindBy(css="#customer_lastname")
	WebElement LastName;
	@FindBy(css="#passwd")
	WebElement PassWord;
	@FindBy(css="#days")
	WebElement Days;
	@FindBy(css="#months")
	WebElement Months;
	@FindBy(css="#years")
	WebElement Years;
	@FindBy(css="#newsletter")
	WebElement newsLettercheck;
	@FindBy(xpath="//input[contains(@id,'opt')]")
	WebElement specialOffers;
	@FindBy(xpath="//input[contains(@id,'com')]")
	WebElement Company;
	@FindBy(css="#address1")
	WebElement Address;
	@FindBy(css="#city")
	WebElement City;
	@FindBy(css="#id_state")
	WebElement State;
	@FindBy(css="#postcode")
	WebElement ZipPostalCode;
	@FindBy(css="select[id$='ntry']")
	WebElement Country;
	@FindBy(css="#other")
	WebElement AdditionalInformation;
	@FindBy(css="#phone")
	WebElement Homephone;
	@FindBy(css="#phone_mobile")
	WebElement Mobilephone;
	@FindBy(css="#alias")
	WebElement Assignaddress;

	public Sign_Up_Form (WebDriver Driver) {
		this.Driver= Driver;
		PageFactory.initElements(Driver, this);
	
	}
		
		public String createaccountpage() {
			return Driver.getTitle();       						//This method returns a String value
		}
		
		
		public void Email(String email)  {
			EmailAddress.sendKeys(email);							//This is a VOID method and returns No Value
		}
		
		public void ClickCreatebutton()  {
			CreateanAccount.get(0).click();							//This is a VOID method and returns No Value
		//	CreateanAccount.get(1).click();
		}
		
		public void GenderMR()  {
			Mr.click();
			}
		
		public void GenderMRS() {
			Mrs.click();
		}
		
		public void Fname(String fname)  {
			FirstName.get(0).sendKeys(fname);
		}
		
		public void Lname(String lname)  {
			LastName.sendKeys(lname);
		}
		
		
		public void Password(String password)  {
			PassWord.sendKeys(password);
		}
		
		public void Day(String day)  {
			WebElement Selectdays= Days;
			Selectdays.click();
			Select sinput =new Select(Selectdays);
			sinput.selectByValue(day);
		}
		
		public void Months(int month)  {
			WebElement Selectmonth= Months;
			Selectmonth.click();
			Select sinput= new Select(Selectmonth);
			sinput.selectByIndex(month);
		}
		
		public void Years(String year)  {
			WebElement Selectyear= Years;
			Selectyear.click();
			Select sinput =new Select(Selectyear);
			sinput.selectByValue(year);
		}
		public void Newsletterheck() { 
		newsLettercheck.click();
		}
		
		public void Specialclick() {
			specialOffers.click();
		}
		
		public void Company(String company)  {
			Company.sendKeys(company);
		}
		
		public void Address(String address)  {
			Address.sendKeys(address);
		}
		
		public void City(String city)  {
			City.sendKeys(city);
		}
		
		public void State(String state) {
			WebElement Selectstate= State;
			Selectstate.click();
			Select sinput= new Select(Selectstate);
			sinput.selectByValue(state);
			}	
		
		public void ZipPostalCode(String zip) {
			ZipPostalCode.sendKeys(zip);
			}
		
		public void Country(String country) {
		WebElement Selectcountry=Country;
		Selectcountry.click();
		Select sinput= new Select(Selectcountry);
		sinput.selectByValue(country);
		}
		
		public void AdditionalInformation(String additional) {
			AdditionalInformation.sendKeys(additional);
		}
		
		
		public void Homephone(String homephone) {
			Homephone.sendKeys(homephone);
		}
		
		public void Mobilephone(String mobilephone) {
			Mobilephone.sendKeys(mobilephone);
		}
		
		public void Assignanaddress(String assignaddress) {
			Assignaddress.clear();
			Assignaddress.sendKeys(assignaddress);
		}

		public void Signuppage(String email,String fname, String lname, String password,String day,int month,String year, String company,String address, String city,
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
			
	
	//By EmailAddress = By.xpath("//*[@name='email_create']");
	//By CreateanAccount = By.xpath("//*[@id='SubmitCreate']");
	//By Mr = By.xpath("//input[@id='id_gender1']");
	//By Mrs = By.xpath("//input[@id='id_gender2']");
	//By FirstName = By.cssSelector("input[id='customer_firstname']");
	//By LastName = By.cssSelector("[id*='customer_lastname']");
	//By PassWord = By.cssSelector("[id*='passwd']");
	//By Days = By.cssSelector("[id*='days']");
	// Months = By.cssSelector("[id*='month']");
	//By Years = By.cssSelector("#years");   				 //for css # represents id
	//By newsLettercheck = By.cssSelector("#newsletter");
	//By specialOffers = By.xpath("//input[contains(@id,'opt')]");  
	//By Company = By.xpath("//input[contains(@id,'com')]");
	//By Address = By.cssSelector("input.form-control[id='address1']");
//	By City = By.cssSelector("#city");
	//By State = By.cssSelector("select[id*='_state']");
	//By ZipPostalCode =By.cssSelector("#postcode");
	//By Country = By.cssSelector("select[id$='ntry']");
	//By AdditionalInformation =By.cssSelector("#other");
	//By Homephone = By.cssSelector("#phone");
	//By Mobilephone = By.cssSelector("#phone_mobile");
	//By Assignanaddress =By.cssSelector("#alias");

}}








/*
Selenium.support
Annotation Type FindBy
@Retention(RUNTIME)
@Target({FIELD,TYPE})
public @interface FindBy
Used to mark a field on a Page Object to indicate an alternative mechanism for locating the element or a list of elements. Used in conjunction with PageFactory this allows users to quickly and easily create PageObjects.
It can be used on a types as well, but will not be processed by default.
You can either use this annotation by specifying both "how" and "using" or by specifying one of the location strategies (eg: "id") with an appropriate value to use. Both options will delegate down to the matching By methods in By class.
For example, these two annotations point to the same element:
 @FindBy(id = "foobar") WebElement foobar;
 @FindBy(how = How.ID, using = "foobar") WebElement foobar;
 
and these two annotations point to the same list of elements:
 @FindBy(tagName = "a") List<WebElement> links;
 @FindBy(how = How.TAG_NAME, using = "a") List<WebElement> links;*/








/*The @FindBys annotation is used in case elements need to match all of the given criteria
The @FindAll annotation is used in case elements need to match at least one of the given criteria*/
