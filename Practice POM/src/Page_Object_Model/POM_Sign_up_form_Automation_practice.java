package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POM_Sign_up_form_Automation_practice {

	WebDriver Driver;
	
	By Email= By.id("email_create");
	By Createaccountbutton= By.id("SubmitCreate");
	By Mr= By.id("id_gender1");
	By Mrs= By.id("id_gender2");
	By Firstname= By.cssSelector("#customer_firstname");
	By Lastname= By.id("customer_lastname");
	By Password= By.name("passwd");
	By Days= By.id("days");									//Drop Down
	By Months= By.id("months");								//Drop Down
	By Years= By.id("years");								//Drop Down
	By Specialoffer= By.cssSelector("#optin");
	By Company= By.id("company");
	By Address1= By.id("address1");
	By Address2= By.id("address1");
	By City= By.id("city");
	By State= By.cssSelector("#id_state");					//Drop Down	
	By Postalcode= By.id("postcode");
	By Country= By.id("id_country");						//Drop Down
	By Additional= By.id("other");
	By Homephone= By.id("phone");
	By Mobilephone= By.id("phone_mobile");
	By Assignaddress= By.id("alias");
	
	
	public POM_Sign_up_form_Automation_practice(WebDriver Driver) {
		this.Driver= Driver;
	}
	
	public String Signuppagetitle() {
		return Driver.getTitle();
	}
	public void Email(String email) {
		Driver.findElement(Email).sendKeys(email);
	}
	
	public void Createaccountbutton() {
		Driver.findElement(Createaccountbutton).click();
	}
	
	public void Mr() {
		Driver.findElement(Mr).click();
	}
	public void Mrs() {
		Driver.findElement(Mrs);
	}
	public void Firstname(String firstname) {
		Driver.findElement(Firstname).sendKeys(firstname);
	}
	public void Lastname(String lastname) {
		Driver.findElement(Lastname).sendKeys(lastname);
	}
	public void Password(String password) {
		Driver.findElement(Password).sendKeys(password);
	}
	public void Days(String days1) {
		WebElement days= Driver.findElement(Days);
		days.click();
		Select input= new Select(days);
		input.selectByValue(days1);
	}
	public void Months(int months1) {
		WebElement months= Driver.findElement(Months);
		months.click();
		Select input= new Select(months);
		input.selectByIndex(months1);
	}
	
	public void Years(String years1) {
		WebElement years= Driver.findElement(Years);
		years.click();
		Select input= new Select(years);
		input.selectByValue(years1);
	}
	
	public void Specialoffer() {
		Driver.findElement(Specialoffer).click();
	}
	
	public void Company(String company) {
		Driver.findElement(Company).sendKeys(company);
	}
	
	public void Address1(String address1) {
		Driver.findElement(Address1).sendKeys(address1);
	}
	
	public void Address2(String address2) {
		Driver.findElement(Address2).sendKeys(address2);
	}
	
	public void City(String city) {
		Driver.findElement(City).sendKeys(city);
	}
	
	public void State(String state1) {
		WebElement state=Driver.findElement(State);
		state.click();
		Select input= new Select(state);
		input.selectByValue(state1);
	}
	
	public void Postalcode(String postalcode) {
		Driver.findElement(Postalcode).sendKeys(postalcode);
	}
	
	public void Additional(String additional) {
		Driver.findElement(Additional).sendKeys(additional);
	}
	
	public void Homephone(String homephone) {
		Driver.findElement(Homephone).sendKeys(homephone);
	}
	
	public void Mobilephone(String mobilephone) {
		Driver.findElement(Mobilephone).sendKeys(mobilephone);
	}
	
	public void Assignaddress(String assignadress) {
	Driver.findElement(Assignaddress).clear();
	Driver.findElement(Assignaddress).sendKeys(assignadress);
	}
	
	public void Signupform(String email, String firstname, String lastname, String password,String days1, int months1, String years1,String company,String address1,String address2,
			String city,String state1, String postalcode,String additional,String homephone, String mobilephone, String assignadress) {
		this.Signuppagetitle();
		this.Email(email);
		this.Createaccountbutton();
		this.Mr();
		this.Firstname(firstname);
		this.Lastname(lastname);
		this.Password(password);
		this.Days(days1);
		this.Months(months1);
		this.Years(years1);
		this.Specialoffer();
		this.Company(company);
		this.Address1(address1);
		this.Address2(address2);
		this.City(city);
		this.State(state1);
		this.Postalcode(postalcode);
		this.Additional(additional);
		this.Homephone(homephone);
		this.Mobilephone(mobilephone);
		this.Assignaddress(assignadress);
	}
}
