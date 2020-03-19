package seleniumtest;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("D:\\Jar files\\DatadrivenTesting\\demotesting.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0;i<=rowcount;i++){
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();//maximize window
			String attri=driver.findElement(By.id("Email")).getAttribute("name");
			System.out.println(attri);
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.name("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Log out")).click();
			

		
		}
		
		
		
		//driver.close();
		

	}

}
