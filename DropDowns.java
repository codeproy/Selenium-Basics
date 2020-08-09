import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Thread.sleep(5000);
		s.selectByIndex(5);
		s.selectByVisibleText("2");
		Thread.sleep(5000);
		Select c = new Select(driver.findElement(By.xpath("//*[@id='childDropdown']/select")));
		c.selectByValue("3");
		Thread.sleep(5000);
		//WebElement option = s.getFirstSelectedOption();
		//System.out.println("Selected Driver " + option.getText());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		System.out.println("Program Completed");
		
	}

}
