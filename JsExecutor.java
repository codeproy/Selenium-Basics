
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecutor{                    //DO NOT Change the class name
	
	public WebDriver driver;
	public String Url = "http://webapps.tekstac.com/Cargo_Shipping_Cost/";

	
	public WebDriver createDriver()  //DO NOT Change the method Signature
	{
	    /* Replace this comment by the code statement to create and return the driver */
	    /* Naviaget to the Url  */
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	    
	}
 
  public String submitForm(String weight,String mode) throws InterruptedException 
  {
      /*Using the driver, Locate the element using javascript executor ONLY. */
      /* Set the form values and submit */
      /* Return the displayed message */
       /*Close the driver*/
      driver.get(Url);
      System.out.println("reached here 1");
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("document.getElementById('weight').value='"+weight+"';");
      js.executeScript("document.getElementById('"+mode+"').click();");
      Thread.sleep(5000);
      js.executeScript("document.getElementById('calculate').click();");
       
       System.out.println("reached here 2");
       //System.out.println(driver.findElement(By.id("result")).getText());
       String script = "return document.getElementById(\"result\").innerText;";
       return (String) js.executeScript(script);
  }
  public static void main(String[] args) throws InterruptedException {
	  JsExecutor at=new JsExecutor();
	 //Add required code
	 at.createDriver();
	 String msg = at.submitForm("50","air");
	 System.out.println(msg);
	 at.driver.close();
  }
  
}
