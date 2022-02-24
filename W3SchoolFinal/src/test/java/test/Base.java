package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	public WebDriver chormeBrower() {
		System.setProperty("webdriver.chrome.driver","D:\\ellipips\\fcebA\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
		
	}
	public WebDriver operaBrower() {
		System.setProperty("webdriver.opera.driver","D:\\ellipips\\fcebA\\Drivers\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}
}
