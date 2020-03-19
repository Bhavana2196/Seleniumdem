package seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("parent window id is: "+parent);
		//for new window
		//driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//for new tab window
		//driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		//driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		//for multiple windows
		driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Multiple']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		int count=allWindows.size();
		System.out.println("Total Window: "+count);
		
		for(String child:allWindows){
			if(!parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				System.out.println("child window title is"+driver.getTitle());
				Thread.sleep(3000);
				
				driver.close();
			}
			
			driver.switchTo().window(parent);
			System.out.println("Parent window title is:"+driver.getTitle());
			
			
			
	
		}
		
		//driver.quit();
		
		
		
		
		

	}

}
