package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("UserFirstName")).sendKeys("Test");
        driver.findElement(By.name("UserLastName")).sendKeys("Name");
        driver.findElement(By.name("UserEmail")).sendKeys("testname@xyz.com");
        WebElement title = driver.findElement(By.name("UserTitle"));
        Select select = new Select(title);
        select.selectByVisibleText("CxO / General Manager");
        driver.findElement(By.name("CompanyName")).sendKeys("Advent Technology");
        WebElement emp = driver.findElement(By.name("CompanyEmployees"));
        Select select1 = new Select(emp);
        select1.selectByValue("950");
        driver.findElement(By.name("UserPhone")).sendKeys("+91-9487890950");
        WebElement country = driver.findElement(By.name("CompanyCountry"));
        Select select2 = new Select(country);
        //select2.deselectByValue("IN");
        select2.selectByValue("DZ");
        //driver.findElement(By.name("CompanyCountry")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.className("checkbox-ui")).click();
        //driver.findElement(By.name("UserPhone")).sendKeys("+91-9487890950");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //WebElement checkbox= driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
        WebElement checkbox= driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]"));
        //WebDriverWait wait=new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        checkbox.sendKeys(Keys.RETURN);
        
        //Select select = new Select(title);
        //select.selectByValue("CxO / General Manager");

	}

}
 