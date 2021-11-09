package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ramvignesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Lakshmanan");
		WebElement currency = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select select = new Select(currency);
		select.selectByVisibleText("INR - Indian Rupee");
		WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select select1 = new Select(country);
		select1.selectByValue("IND");
		driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
		System.out.println(title);
	    String FirstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(FirstName);
		//driver.close();
		
	}

}
