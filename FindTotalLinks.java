import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTotalLinks {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Finding total number of links in whole page
		List<WebElement> totalElemt = driver.findElements(By.tagName("a"));
		System.out.println(totalElemt.size());
		
		//Finding total number of links in footer
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		totalElemt = footer.findElements(By.tagName("a"));
		System.out.println(totalElemt.size());
		
		//Finding total number of links in first column of footer
		
		WebElement firstColFooter = driver.findElement(By.xpath("(//div[@id='gf-BIG']//ul)[2]"));
		totalElemt = firstColFooter.findElements(By.tagName("a"));
		System.out.println(totalElemt.size());
		
		driver.close();
		
		
	}

}
