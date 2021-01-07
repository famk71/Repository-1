package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_form {
	
WebDriver Driver;
@FindBy(tagName= "title")
WebElement title;
@FindBy(className= "login")
WebElement Login;

public Sign_in_form (WebDriver Driver) {
	this.Driver= Driver;
	PageFactory.initElements(Driver, this);
}
public String MainpageTitle() {
	return Driver.getTitle();
	//return title.getText();
}

public void Signin() {
	Login.click();
}

public String SigninPageTitle() {
	return Driver.getTitle();
}

public void Opensinginpage() {
	this.MainpageTitle();
	this.Signin();
	this.SigninPageTitle();
}
}
