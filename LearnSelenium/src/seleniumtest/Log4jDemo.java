package seleniumtest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	

	public static void main(String[] args) {
	Logger log =Logger.getLogger(Log4jDemo.class);
	System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	log.info("url launched");
	String expectedresult="Google";
	String actualresult=driver.getTitle();
	System.out.println("title is:"+actualresult);
	log.warn("check titlt");
	
	if(expectedresult.equals(actualresult)){
		System.out.println("correct");
		log.info("the url is correct");
	}
	else{
		System.out.println("incorrect");
		log.error("the url is not correct");
		
	}
	
	driver.close();
}
}