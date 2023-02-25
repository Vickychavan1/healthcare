package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver openbrowser()
	{
		System.setProperty("WebDriver.chrome.driver", "src\\test\\resources\\browser\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
	}

}
