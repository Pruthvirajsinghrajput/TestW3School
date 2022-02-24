package pom;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	private WebDriver driver;
	private ArrayList <String> add;
	@FindBy (xpath="(//a[text()='Tutorials '])[1]")
	private WebElement tutorials;
	
	@FindBy (xpath="//a[text()='Learn JavaScript']")
	private WebElement javasc;
	
	@FindBy (xpath="//a[text()='JS Popup Alert']")
	private WebElement log;
	
	@FindBy (xpath="(//a[text()='Try it Yourself »'])[1]")
	private WebElement tryuse;
	
	@FindBy (xpath="(//iframe[@frameborder='0'])[2]")
	private WebElement fram;
	
	@FindBy (xpath="(//button[text()='Try it']")
	private WebElement ru;
	
	@FindBy (xpath="(//a[@title='Home'])[2]")
	private WebElement hi;
	
	public PomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void MehtodTutorials() {
		tutorials.click();
		
	}
	public void MehtodJavasc() throws InterruptedException {
		Thread.sleep(5000);
		javasc.click();
	}public void MehtodLog() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",log);
		log.click();
	}public void MehtodTryuse() throws InterruptedException {
		Thread.sleep(5000);
		tryuse.click();
	}public void MehtodFram() throws InterruptedException {
		Thread.sleep(5000);
		 add=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		fram.click();
		driver.switchTo().frame(fram);
	}public void MehtodRu() throws InterruptedException {
		
		ru.click();

		Alert aa=driver.switchTo().alert();
		aa.accept();
		Thread.sleep(5000);
		driver.switchTo().window(add.get(0));
		Thread.sleep(5000);
	}public void MehtodHi() throws InterruptedException {
		Thread.sleep(5000);
		hi.click();
	}
	
	
	public boolean isTutorials() throws InterruptedException {
		Thread.sleep(5000);
		boolean b1=tutorials.isEnabled();
		System.out.println(b1);
		return b1;
	}
	public boolean isJavasc() throws InterruptedException {
		Thread.sleep(5000);
		boolean b2=javasc.isEnabled();
		System.out.println(b2);
		return b2;
	}
	
}
