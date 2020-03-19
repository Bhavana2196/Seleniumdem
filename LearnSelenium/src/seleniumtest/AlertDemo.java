package seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();//maximize window
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1=driver.switchTo().alert();
		
		String AlertMessage=driver.switchTo().alert().getText();
		System.out.println(AlertMessage);
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String AlertMessage2=driver.switchTo().alert().getText();
		System.out.println(AlertMessage2);
		Thread.sleep(3000);
		alert1.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String AlertMessage3=driver.switchTo().alert().getText();
		System.out.println(AlertMessage3);
		Thread.sleep(3000);
		alert1.sendKeys(AlertMessage3);
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
