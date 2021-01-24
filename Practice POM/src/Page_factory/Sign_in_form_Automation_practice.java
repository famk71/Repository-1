package Page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_form_Automation_practice {
WebDriver Driver;

@FindBy(tagName="title")
WebElement Title;

@FindBy(className= "login")
WebElement Login;


public Sign_in_form_Automation_practice(WebDriver Driver) {				//Letting the Driver to use this class publicly
	this.Driver= Driver;
	PageFactory.initElements(Driver, this);
}

public String Mainpagetitle() {
	return Driver.getTitle();
}

public void Login() {
	Login.click();
}

public String Signinpagetitle() {
	return Driver.getTitle();
}

public void Openloginpage() {
	this.Mainpagetitle();
	this.Login();
	this.Signinpagetitle();
	
}
}
