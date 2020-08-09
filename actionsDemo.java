import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://www.amazon.ca/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).build().perform();
		System.out.println(driver.getTitle());
		
		WebElement account = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));
		a.moveToElement(account).contextClick(account).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Data Science").sendKeys(Keys.UP ,Keys.SHIFT).build().perform();
		//a.click(By.xpa)
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

	
	
}
