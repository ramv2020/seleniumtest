package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3DeleteLead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
	    Thread.sleep(2000);
	    WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//System.out.println("First LeadID: "+leadID.getText());
		String lead = leadID.getText();
		leadID.click();
		driver.findElement(By.linkText("Delete")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		boolean msg =driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		if(msg==true) {
			System.out.println("Record Deleted");
		}
		else
		System.out.println("Record not Deleted");
	driver.close(); 
		
		
		
		
	}

}
