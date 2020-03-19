package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/file.html");
		driver.manage().window().maximize();
		String toolname=driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("tool name is: "+toolname);
		driver.close();
	}

}
