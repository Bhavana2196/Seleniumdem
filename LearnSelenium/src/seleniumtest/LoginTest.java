package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();//maximize window
		driver.findElement(By.id("Email")).sendKeys("bhavanakinhekar8@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("bhavana");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
		//driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		//driver.findElement(By.partialLinkText("//span[contains(text(),'Wishlist')]")).click();
		
		String expectedresult="Demo Web Shop";
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		
		
		
		if(expectedresult.equals(actualresult)){
			System.out.println("correct");
		}
		else{
			System.out.println("incorrect");
		}
		
		
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
