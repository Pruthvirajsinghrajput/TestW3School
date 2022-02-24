package uit;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
public static void scrrenShots(WebDriver driver,int testId) throws IOException {
File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd HH mm ss.SSS");
Date d=new Date();
String formateDate=sd.format(d);

File dest=new File("F:\\FailTestCase\\"+testId+formateDate+"\\.jpg");
FileHandler.copy(src, dest);
}
}
