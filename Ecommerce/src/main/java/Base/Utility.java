package Base;

import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver driver;

	/**
	 * Constructor of the class
	 * 
	 * @param driver
	 */
	public Utility(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUp() {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
	}
}
