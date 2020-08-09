import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ValidateSort {

	private static WebDriver driver;
	
	private void setDriver() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	private void getUrl(String url) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	private boolean ifSorted(String xpathLoc, String sortFlag) {
		
		if (sortFlag.equalsIgnoreCase("d")){
			
			driver.findElement(By.xpath("//th/b[contains(text(),'fruit')]")).click();
			
		}
		
		List<WebElement> elements = driver.findElements(By.xpath(xpathLoc));
		
		int size = elements.size();
		
		String[] storeText = new String[size];
		
		for(int i=0;i <size;i ++) {
			
			storeText[i] = elements.get(i).getText();
		}

		/*
		for (int i=0 ;i <size;i ++) {
			System.out.println(storeText[i]);
		}
		*/
		
		String[] storeTextSorted = storeText.clone();
		
		if (sortFlag.equalsIgnoreCase("a")){
			
			Arrays.sort(storeTextSorted);
			
		}
		else {
			Arrays.sort(storeTextSorted,Collections.reverseOrder());
			
		}
		
		//System.out.println("After Sort");
	
		if (Arrays.equals(storeText, storeTextSorted)){
			System.out.println("Sorted");
			return true;
		}
		else {
			System.out.println("Not Sorted");
			return false;
		}
		
		
	}
	
	private void tearDown() {
		
		driver.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidateSort v1 = new ValidateSort();
		v1.setDriver();
		v1.getUrl("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		v1.ifSorted("//tbody//tr/td[2]","a");
		v1.ifSorted("//tbody//tr/td[2]","d");
		v1.tearDown();
	
	}

}
