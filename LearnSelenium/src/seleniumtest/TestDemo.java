package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();//maximize window

		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		System.out.println(PageTitle.length());
		
		String expectedurl="http://demowebshop.tricentis.com/login";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		
		if(expectedurl.equals(actualurl)){
			System.out.println("correcturl");
		}
		else{
			System.out.println("incorrecturl");
		}
		
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		System.out.println(Pagesource.length());
		
		driver.close();
		
		
		

	}

}
