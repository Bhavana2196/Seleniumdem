package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckMethodDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Jar files\\geckodriver-v0.26.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		
		if(checkpresence==true && checkenable==true){
			driver.findElement(By.id("Email")).sendKeys("bhavanakinhekar8@gmail.com");
		}
		driver.close();

	}

}
