import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a.action-button")).click();
		Thread.sleep(5000);
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println("Child "+ driver.getTitle());
		driver.close();	
		driver.switchTo().window(parentid);
		System.out.println("Back to Parent " + driver.getTitle());
		driver.close();	
		
	}

}
