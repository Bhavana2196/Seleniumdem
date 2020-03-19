package seleniumtest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bhavana");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kinhekar");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("bhivaji nagar,Maregaon");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("bhavanakinhekar@gamail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("7218569293");
		driver.findElement(By.xpath("//input[@name='radiooptions'and @value='Male']")).click();
		//driver.findElements(By.xpath("//input[@id='checkbox1' and @value='Cricket' and @id='checkbox2' and @value='Movies']")).
		//driver.findElement(By.xpath("//input[@id='checkbox2' and @value='Movies']")).click();
		
		//for check box
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<cb.size();i++){
			cb.get(i).click();
		}
		
		
		//driver.findElement(By.xpath("//div[@id='msdd']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//select[@id='Skills']//option[10]")).click();
		driver.findElement(By.xpath("//option[106]")).click();
		//driver.findElement(By.id("select2-country-container")).click();
	
		//driver.findElement(By.xpath("//option[contains(text(),'1996')]")).click();
		//driver.findElement(By.xpath("//option[contains(text(),'September')]")).click();
		//driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'21')]")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1= new Select(year);
		sel1.selectByIndex(10);
		
		List<WebElement> yearcount=sel1.getOptions();
		System.out.println(yearcount.size());
		for(int i=0;i<yearcount.size();i++){
			System.out.println(yearcount.get(i).getText());
		}
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2= new Select(month);
		sel2.selectByVisibleText("May");
		
		List<WebElement> monthcount=sel2.getOptions();
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++){
			System.out.println(monthcount.get(i).getText());
		}
		
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel3= new Select(day);
		sel3.selectByIndex(12);
		
		List<WebElement> daycount=sel3.getOptions();
		System.out.println(daycount.size());
		for(int i=0;i<daycount.size();i++){
			System.out.println(daycount.get(i).getText());
		}

		
		
		driver.findElement(By.id("firstpassword")).sendKeys("Bhavana@21");
		driver.findElement(By.id("secondpassword")).sendKeys("Bhavana@21");
		driver.findElement(By.name("signup")).click();
		driver.close();
		
		
		
		
	}

}
