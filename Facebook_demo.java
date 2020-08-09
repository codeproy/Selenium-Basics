import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		//String title = driver.getTitle();
		//System.out.println("Title is " + title);
		
		/*
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("partho.ece1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		Thread.sleep(5000);
		*/
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Forgot account?")).click();;
	/*	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("partha");
		driver.findEleme(By.xpath("//*[@id='password']")).sendKeys("psw1");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Boolean isPresent = driver.findElements(By.xpath("//*[@id='error']")).size() > 0;
		if (isPresent==true) {
			WebElement element = driver.findElement(By.xpath("//*[@id='error']"));
			String val = element.getAttribute("innerText");
			System.out.println(val);
		}
	*/
		driver.navigate().to("http://webapps.tekstac.com/AddressBook/");
		Thread.sleep(5000);
		String fname = driver.findElement(By.xpath("//td[contains(text(),'NickName')]/ancestor::div")).getText();
		System.out.println(fname);
		driver.close();
		
	}

}
