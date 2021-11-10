package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Duplicatelead {

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
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ram@test.com");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
	    Thread.sleep(2000);
	    //WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//System.out.println("First LeadID: "+leadID.getText());
		//String lead = leadID.getText();
		WebElement leadname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		//System.out.println("First LeadID: "+leadID.getText());
		String leadname1 = leadname.getText();
		System.out.println(leadname1);
		leadname.click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		WebElement first= driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String leadname2 = first.getText();
		System.out.println(leadname2);
		Thread.sleep(2000);
		System.out.println("lead name for the original record"+leadname1);
		System.out.println("lead name for the duplicate record"+leadname2);
	//driver.close(); 
		
		
		
		
	}

}
