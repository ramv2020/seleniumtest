package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		System.out.println("First Lead ID: " +leadID.getText());
		leadID.click();
		
		
		driver.findElement(By.id("lastNameField")).sendKeys("Lakshmanan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Laxman");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Accounting");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Account");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Ram@test.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Random Input Text");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String title = driver.getTitle();
		System.out.println("Title of the page: " +title);
	    
		
	}

}
