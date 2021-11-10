package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3editLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ramvignesh");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
	    //WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//System.out.println("First LeadID: "+leadID.getText());
		//String lead = leadID.getText();
		WebElement leadname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		leadname.click();
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		String compnew ="TCS";
		System.out.println("companyname to be updated is"+compnew);
		WebElement compname=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		compname.clear();
		compname.sendKeys(compnew);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String updatecompname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("companyname post update is"+updatecompname);
	//driver.close(); 
		
		
		
		
	}

}
