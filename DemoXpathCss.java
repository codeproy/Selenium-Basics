import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpathCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Syntax Xpath - //tagname[@attribute=value]
		//Xpath - //*[@attribute=value] - if we dont know the target name
		
		//Regular Expression //tagname[contains(@attribute,value)]
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("partha");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("psw1");
		driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		Thread.sleep(5000);
		//driver.close();
		
		
		//trying css now
		//Syntax CSS - tagname[attribute=value],
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("partha");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("psw1");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Sucessfully Execution Completed");

	}

}
