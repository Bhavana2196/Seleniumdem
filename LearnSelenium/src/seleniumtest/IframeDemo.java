package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement> iframecount= driver.findElements(By.tagName("iframe"));
		System.out.println("No of Frames: "+iframecount.size());
		
		for(int i=0;i<iframecount.size();i++){
			System.out.println(iframecount.get(i).getAttribute("name"));
			
		
		}
		
		//switch to frame
		
		WebElement frame=driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]"));
		frame.click();
		driver.switchTo().frame(frame);
		//enter value in textbox
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("selenium");
		
		
		
		//iframe within an iframe
		
		driver.switchTo().defaultContent();
		
		WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		secondtab.click();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox2.sendKeys("webdriver");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
