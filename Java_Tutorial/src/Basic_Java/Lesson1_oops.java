package Basic_Java;

import org.openqa.selenium.chrome.ChromeDriver;

//Java package contains classes, methods, interfaces, objects in a logical format.
public class Lesson1_oops {
   //What is public? == Public is an access modifier it allows access for Classes, Attributes, Method And Constructors. 
	//What is CLass? == EX: Java "Animal" is a class and describes the behavior and action of an object "Tiger".
 					    //All methods has to be written within a class
	
	public static void main(String[] args) {
		// What is Static? == Static is also an access modifier it allows the attribute and method belong only to the class
		 //What is Void? == Means it doesn't return a value, it could only return a value if defined when we declare a method.
		  //What is "main"? == THis is the main method of JAVA. It is required to run JAVA program. It's fixed and will not change.
		   //What is String[]? == It is a simple Array of string. EX: ["1", "2", "3"]
			//What is args? == Represents a generic name of string arrays.
			 //String[] args == They are parameters for the main method. They are used to compile the JAVA program
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver Driver= new ChromeDriver();
		
							//What is Driver? == Driver is an object of the class "ChromeDriver". Driver has no attribute but it has method "ChromeDriver"
							//ChromeDriver() == This is class constructor of ChromeDriver class
							//A class constructor is a method of the class that has properties of the class itself
							//Meaning we can execute the class as a method
		                     //Controls the "webdriver/chromedriver" object or instance and allows to drive the browser
							 //This process is called object instantiation in JAVA
		
		Driver.get("http://automationpractice.com/index.php");
			//If "Driver" is the Ferrari "Get" is the GPS which navigates to the Location of the website.
			  //Get is another method//
		
	
	}

}
