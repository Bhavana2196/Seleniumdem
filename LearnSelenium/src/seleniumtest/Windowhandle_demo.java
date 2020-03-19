package seleniumtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String>iter= allWindowHandles.iterator();
		
		String parentwindow=iter.next();
		String childwindow=iter.next();
		
		driver.switchTo().window(childwindow);
		
		driver.close();
		
		driver.switchTo().window(parentwindow);

	}

}
