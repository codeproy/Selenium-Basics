import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutCart {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(elements.size());
		String searchElement[] = {"Brocolli","Cucumber","Potato"};
		selectCart(driver,elements,searchElement);
				
		driver.close();
		
	}

	
	public static void selectCart(WebDriver driver, List<WebElement> elements, String searchElement[]) {
		
		int j = 0;
		for (int i=0; i< elements.size(); i++) {
			
			
			String text = elements.get(i).getText().split("-")[0].trim();
			List al = Arrays.asList(searchElement);
			if (al.contains(text)){
				j ++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(text);
			}
			
			if (j==al.size()) break;
		}
		
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//*[@type='button']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[contains(text(),'Apply')]")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		//driver.close();
		
	}
}
