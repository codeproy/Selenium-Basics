import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShippingDetails {        //DO NOT change the class name
	
static WebDriver driver;
	
	public WebDriver createDriver()
	{
	   //Create driver, store in in static variable 'driver' and return it
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public static void setNewFormValues(String shipmentid,String name,String departuredate,String arrivaldate)
	{
		//Find the form elements and set values by passing those values from 'main' method. 
	    //Submit form to add the details
	    driver.get("http://webapps.tekstac.com/CustomerShippingDetails/");
	    driver.findElement(By.id("shipmentid")).sendKeys(shipmentid);
	    driver.findElement(By.id("name")).sendKeys(name);
	    driver.findElement(By.id("departuredate")).sendKeys(departuredate);
	    driver.findElement(By.id("arrivaldate")).sendKeys(arrivaldate);
	    driver.findElement(By.id("add")).click();
	}
	
	public static WebElement getNewShipmentId() {
		//Find and return the 'shipmentid' web element of the row displayed after first submit
		return driver.findElement(By.xpath("//div[@id='result']//tbody//tr[2]//td[1]"));
	}
	public static WebElement getNewName() {
		//Find and return the 'name' web element of the row displayed after first submit
		return driver.findElement(By.xpath("//div[@id='result']//tbody//tr[2]//td[2]"));
	}
	public static WebElement getNewdepartureDate() {
		//Find and return the 'departuredate' web element of the row displayed after first submit
		return driver.findElement(By.xpath("//div[@id='result']//tbody//tr[2]//td[3]"));
	}
	public static WebElement getNewArrivalDate() {
		//Find and return the 'arrivaldate' web element of the row displayed after first submit
		return driver.findElement(By.xpath("//div[@id='result']//tbody//tr[2]//td[4]"));
	}
	
	public static void editDetails() {
		//Find the first radio button and click 
	    //Find edit button and click
		driver.manage().window().maximize();
	    driver.findElement(By.name("radio")).click();
	     driver.findElement(By.id("edit")).click();
	}
	
	
	public static String getEditShipmentId() {
		//Find and return the 'shipmentid' value in the edit box in the form after cicking edit
		System.out.println(driver.findElement(By.id("shipmentid")).getAttribute("value"));
		return driver.findElement(By.id("shipmentid")).getText();
	}
	public static String getEditName() {
		//Find and return the 'name' value in the edit box in the form after cicking edit
		return driver.findElement(By.id("name")).getText();
	}
	
	public static String EditNewDepartureDate() {
		//Find and return the 'departuredate' value in the edit box in the form after cicking edit
		return driver.findElement(By.id("departuredate")).getText();
	}
	
	public static String getEditArrivalDate() {
		//Find and return the 'arrivaldate' value in the edit box in the form after cicking edit
		return driver.findElement(By.id("arrivaldate")).getText();
	}
	
	
	
	public static void setUpdateFormValues(String shipmentid,String name,String departuredate,String arrivaldate)
	{
		//Set form values to update and submit (by passing those values from 'main' method). 
		driver.findElement(By.id("shipmentid")).clear();
		driver.findElement(By.id("shipmentid")).sendKeys(shipmentid);
		driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys(name);
	    driver.findElement(By.id("departuredate")).clear();
	    driver.findElement(By.id("departuredate")).sendKeys(departuredate);
	    driver.findElement(By.id("arrivaldate")).clear();
	    driver.findElement(By.id("arrivaldate")).sendKeys(arrivaldate);
	    driver.findElement(By.id("add")).click();
	}
	
	public static void deleteDetails() throws InterruptedException {
		//Find the SECOND row of address displayed and click the radio button
		//Find delete button and click to delete SECOND row
		  driver.findElement(By.name("radio")).click();
	     driver.findElement(By.id("delete")).click();
	     Thread.sleep(5000);
	     driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ShippingDetails ab=new ShippingDetails();
		//Add required code
		ab.createDriver();
		ab.setNewFormValues("12345","Partha","01/01/2020","01/02/2020");
		ab.getNewShipmentId();
		ab.getNewName();
		ab.getNewdepartureDate();
		ab.getNewArrivalDate();
		ab.editDetails();
		ab.getEditShipmentId();
		ab.getEditName();
		ab.EditNewDepartureDate();
		ab.getEditArrivalDate();
		ab.setUpdateFormValues("12346","Parthx","01/01/2021","01/02/2021");
		ab.deleteDetails();
	}
}
