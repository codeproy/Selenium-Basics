import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		

		WebDriverWait w = new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("travel_from")));

		driver.findElement(By.id("travel_from")).sendKeys("India");

		System.out.println("reached here");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("travel_date")));
		WebElement date = driver.findElement(By.xpath("//input[@id='travel_date']"));
		date.click();
		List<WebElement> days = driver.findElements(By.className("day"));
		
		System.out.println("No of days " + days.size());
		
		for (int i = 0;i < days.size(); i++) {
			
			if (days.get(i).getText().equals("23")){
				System.out.println(days.get(i).getText());
				days.get(i).click();
				break;
			}
			
		}
		date.click();
		System.out.println("completed here" + driver.findElement(By.cssSelector("td[class='active day']")).getText() );
		driver.close();
		
	}

}
