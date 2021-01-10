package testcase;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Latest Selenium jar file
		 * latest driver.exe
		 * latest browser version
		 */
		//System.setProperty("webdriver.chrome.driver", "C:\\Seleniumpreset\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();//from webdrivermanager dependency repository
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");

	}
//dependency management tool/build too ->Maven
}
