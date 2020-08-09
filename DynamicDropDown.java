import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		//s.selectByValue("Ahmedabad (AMD)");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Program Completed");
	}

}
