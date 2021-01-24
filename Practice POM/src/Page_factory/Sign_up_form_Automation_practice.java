package Page_factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sign_up_form_Automation_practice {

	WebDriver Driver;
	
	@FindBy(id="email_create")									//Element- Email address box
	WebElement Email;
	
	@FindBy (xpath="//i[@class='icon-user left']")				//Element- Login Button
	WebElement Loginbutton;
	
	@FindBy(xpath="//input[@id='id_gender1']")					//Element= MR
	WebElement Mr;
	
	@FindBy(xpath="//input[@id='id_gender2']")					//Element- MRS
	WebElement Mrs;
	
	@FindBy(css="#customer_firstname")							//Element- First Name
	WebElement Firstname;
	
	@FindBy(how= How.ID, using="customer_lastname") 			//Element- Last Name
	WebElement Lastname;
	
	@FindBy(css="#passwd")										//Element- Password
	WebElement Password;
	
	@FindBy(id="days")											//Element- Days	Drop down
	WebElement Days;
																
	@FindBy(id="months")										//Element- Months Drop Down 
	WebElement Months;
	
	@FindBy(id="years")											//Element- Years Drop Down
	WebElement Years;
	
	//@FindBys({@FindBy(css="#newsletter"), @FindBy(css="#optin")}) 	//Element- Both newsletter and Special offer
	//List <WebElement> Checkbox;

	@FindBy (xpath="//input[contains(@name, 'mpany')]")				//Element- Company
	WebElement Company;
	
	@FindBys({@FindBy(xpath="//input[@name='address1']")})			//Element- Address 1
	List <WebElement> Address1;
	
	@FindBy(css="#address2")										//Element- Address 2
	WebElement Address2;
	
	@FindBy(css="#city")											//Element- City
	WebElement City;
	
	@FindBy(css="#id_state")										//Element- State Drop Down
	WebElement State;
	
	@FindBy(css="#postcode")										//Element- PostCode
	WebElement PostalCode;
	
	@FindBy(css="#id_country")										//Element- Country Drop Down
	WebElement Country;
	
	@FindBy(css="#other")											//Element- Additional Info
	WebElement Additionalinformation;
	
	@FindBy (css="#phone")											//Element- Home phone
	WebElement Homephone;
	
	@FindBy(css="input[id$='_mobile']")								//Element- Mobile Phone
	WebElement Mobilephone;
	
	@FindBy (id="alias")											//Element- Assign Address
	WebElement Assignaddress;
	
	
	public Sign_up_form_Automation_practice(WebDriver Driver) {
	this.Driver= Driver;
	PageFactory.initElements(Driver, this);
	}
	
	
	public String Signinpagetitle() {
	return Driver.getTitle();
	}
	
	public void Email(String email) {
		Email.sendKeys(email);
	}
	
	public void Login() {
		Loginbutton.click();
	}
	
	public void Mr() {
		Mr.click();
	}
	
	public void Mrs() {
		Mrs.click();
	}
	
	public void Firstname(String firstname) {
		Firstname.sendKeys(firstname);
	}
	
	public void Lastname(String lastname) {
		Lastname.sendKeys(lastname);
	}
	
	public void Password(String password) {
		Password.sendKeys(password);
	}
	
	public void Days(String days) {
		Days.click();
		Select input1=new Select(Days);
		input1.selectByValue(days);
	}
	
	public void Months(String months) {
		Days.click();
		Select input2= new Select(Months);
		input2.selectByValue(months);
	}
	
	public void Years(int years) {
		Years.click();
		Select input3= new Select(Years);
		input3.selectByIndex(years);
	}
	
	//public void Checkbox() {
		//Checkbox.get(0).click();
		
	//}
	
	public void Company(String company) {
		Company.sendKeys(company);
	}
	
	public void Address1(String address1) {
		Address1.get(0).sendKeys(address1);
	}
	
	public void Address2(String address2) {
		Address2.sendKeys(address2);
	}
	
	public void City(String city) {
	City.sendKeys(city);
	}
	
	public void State(String state) {
		State.click();
		Select input4= new Select(State);
		input4.selectByValue(state);
	}
	
	public void PostalCode(String postalcode) {
	PostalCode.sendKeys(postalcode);
	}
	
	public void Country(String country) {
		Country.click();
		Select input5= new Select(Country);
		input5.selectByValue(country);
	}
	
	public void Additionalinformation(String additional) {
		Additionalinformation.sendKeys(additional);
	}
	
	public void Homephone(String homephone) {
		Homephone.sendKeys(homephone);
	}
	
	public void Mobilephone(String mobilephone) {
		Mobilephone.sendKeys(mobilephone);
	}
	
	public void Assignaddress(String assignaddress) {
		Assignaddress.clear();
		Assignaddress.sendKeys(assignaddress);
	}
	
	
	public void Signuppage(String email, String firstname,String lastname, String password, String days,String months,int years,String company,
			String address1,String address2,String city, String state,String postalcode,String country,String additional,String homephone
			,String mobilephone, String assignaddress) {
		
		this.Email(email);
		this.Login();
		this.Mrs();
		this.Firstname(firstname);
		this.Lastname(lastname);
		this.Password(password);
		this.Days(days);
		this.Months(months);
		this.Years(years);															//integer/index
		//this.Checkbox();
		this.Company(company);
		this.Address1(address1);
		this.Address2(address2);
		this.City(city);
		this.State(state);
		this.PostalCode(postalcode);
		this.Country(country);
		this.Additionalinformation(additional);
		this.Homephone(homephone);
		this.Mobilephone(mobilephone);
		this.Assignaddress(assignaddress);
	}
	
	
}
