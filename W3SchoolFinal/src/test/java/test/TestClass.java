package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.PomClass;
import uit.Utility;


public class TestClass extends Base{
	private PomClass pomClass;
	private WebDriver driver;
	private SoftAssert softAssert;
	private int testId ; 
	@BeforeTest
	
	@Parameters("browser")
	public void beforeTest(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			driver= chormeBrower();
			
		}
		if(browser.equalsIgnoreCase("opera")) {
			driver=operaBrower();
		}
			
	}
	@BeforeClass
	public void beforeClass() {
		driver.get("https://www.w3schools.com/java/default.asp");
//		softAssert=new SoftAssert();
		pomClass=new PomClass(driver);
	
	}
//	@Test(priority =1)
//	public void test1() {
//		testId=101;
//		pomClass.MehtodTutorials();
//	}
	@Test(priority =2)
	public void test2() throws InterruptedException {
		testId=102;
		boolean b2=pomClass.isTutorials();
		softAssert.assertEquals(b2,"true");
		System.out.println(b2);
	}
	@Test(priority =3)
	public void test3() throws InterruptedException {
		testId=103;
		pomClass.MehtodJavasc();
	}
	@Test(priority =4)
	public void test4() throws InterruptedException {
		testId=104;
		boolean b3=pomClass.isJavasc();
		softAssert.assertEquals(b3,"true");
		System.out.println(b3);
		
	}
	@Test(priority =5)
	public void test5() throws InterruptedException {
		testId=105;
		pomClass.MehtodLog();
		
	}
	@Test(priority =6)
	public void test6() throws InterruptedException {
		testId=106;
		pomClass.MehtodTryuse();
		
	}
	@Test(priority =7)
	public void test7() throws InterruptedException {
		testId=107;
		pomClass.MehtodFram();
		
	}
	@Test(priority =8)
	public void test8() throws InterruptedException {
		testId=108;
		pomClass.MehtodRu();
		
	}
	@Test(priority =9)
	public void test9() throws InterruptedException {
		testId=109;
		pomClass.MehtodHi();
		
	}
	@AfterMethod
	public void afterMehtod(ITestResult result) throws IOException {
		System.out.println("Fail");
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.scrrenShots(driver, testId);
		}
	}
	@AfterClass
	public void afterClass() {
		pomClass=null;
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
		System.gc();
	}
}
