import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSeparateTabs {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Finding total number of links in whole page

		
		//Finding total number of links in first column of footer
		
		WebElement firstColFooter = driver.findElement(By.xpath("(//div[@id='gf-BIG']//ul)[1]"));
		List<WebElement> totalElemt = firstColFooter.findElements(By.tagName("a"));
		int linkSize = totalElemt.size();
		System.out.println(linkSize);
		for (int i = 0;i < linkSize;i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			totalElemt.get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
		
		Set<String> ids = driver.getWindowHandles();
		ids.forEach((e) ->{
			
			driver.switchTo().window(e);
			System.out.println(driver.getTitle());
		});
		
		driver.quit();
		
	}

}
