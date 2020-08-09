import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webpage = "https://www.cricbuzz.com/live-cricket-scorecard/19190/ind-vs-sl-1st-test-sri-lanka-tour-of-india-2017";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(webpage);
		WebElement firstTable = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		/*
		//By rowIdent = By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']");
		By scoreIdent = By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)");
		int totalRows = firstTable.findElements(scoreIdent).size();
		List<WebElement> scoreElemnts = firstTable.findElements(scoreIdent);
		for (int i=0;i <totalRows; i ++) {
			System.out.println(scoreElemnts.get(i).getText());
		}
		*/
		By rowIdent = By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']");
		By scoreIdent = By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)");
		By extraIdent = By.xpath("//div[text() = 'Extras']/following-sibling::div");
		By toalIdent = By.xpath("//div[text() = 'Total']/following-sibling::div");
		int totalRows = firstTable.findElements(rowIdent).size();
		List<WebElement> rowElemnts = firstTable.findElements(rowIdent);
		int sm = 0 ;
		for (int i=0;i <totalRows -2; i ++) {
			String s = rowElemnts.get(i).findElement(scoreIdent).getText();
			sm += Integer.parseInt(s); 
			System.out.println(s);
			 
		}
		int extraRun = Integer.parseInt(driver.findElement(extraIdent).getText().trim());
		System.out.println("Sum is  " + (sm + extraRun));
		int toalRun = Integer.parseInt(driver.findElement(toalIdent).getText().trim());
		System.out.println("Retr sum is " + toalRun);
		driver.close();
	}

}
