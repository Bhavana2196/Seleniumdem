package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebDriverWait Mywait=new WebDriverWait(driver,10);//explicit wait
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Welcome Admin")));
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		WebDriverWait Mywait1=new WebDriverWait(driver,10);//explicit wait
		Mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();
		
	}

}
