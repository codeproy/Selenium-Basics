import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		//String title = driver.getTitle();
		//System.out.println("Title is " + title);
		
		driver.get("https://login.salesforce.com/?locale=ca");
	
		driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("partha");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("psw1");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Boolean isPresent = driver.findElements(By.xpath("//*[@id='error']")).size() > 0;
		if (isPresent==true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='error']"));
			String val = element.getAttribute("innerText");
			System.out.println(val);
		}
		driver.close();
		
	}

}
