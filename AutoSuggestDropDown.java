import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id=\"root\"]")).click();
		WebElement fromCity =  driver.findElement(By.id("fromCity"));
		
		WebElement toCity =  driver.findElement(By.id("toCity"));
		fromCity.click();
		Thread.sleep(2000);
		WebElement fromPlaceholder = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		fromPlaceholder.sendKeys("MUM");
		Thread.sleep(2000);
		fromPlaceholder.sendKeys(Keys.ARROW_DOWN);
		fromPlaceholder.sendKeys(Keys.ENTER);
		
		//toCity.click();
		Thread.sleep(2000);
		WebElement toPlaceholder = driver.findElement(By.xpath("//input[@placeholder=\"To\"]"));
		toPlaceholder.sendKeys("DEL");
		Thread.sleep(2000);
		toPlaceholder.sendKeys(Keys.ARROW_DOWN);
		toPlaceholder.sendKeys(Keys.ENTER);
		//toCity.click();
		Thread.sleep(5000);
		driver.close();

	}

}
