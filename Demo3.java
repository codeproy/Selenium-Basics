import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	
	static String fname;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		//String title = driver.getTitle();
		//System.out.println("Title is " + title);
		
		driver.get("https://webapps.tekstac.com/Shopify/");
		Thread.sleep(5000);
		WebElement Fname = driver.findElement(By.name("fname"));
		Fname.sendKeys("Partha");
		fname = Fname.getText();
		
		
		System.out.println(fname);
		driver.close();
		
	}

}
