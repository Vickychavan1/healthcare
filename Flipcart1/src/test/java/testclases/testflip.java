package testclases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testflip {
	@Test
	void launchFlipcart(WebDriver driver) {
		
		driver.get("https://www.flipkart.com/");
		
	}
	
	

}
