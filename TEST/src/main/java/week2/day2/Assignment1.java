package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Test");
        driver.findElement(By.name("lastname")).sendKeys("Name");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("+91-987654321");
        driver.findElement(By.id("password_step_input")).sendKeys("Test2021");
        WebElement date = driver.findElement(By.id("day"));
        Select select = new Select(date);
        select.selectByVisibleText("17");
        WebElement month = driver.findElement(By.id("month"));
        Select select1 = new Select(month);
        select1.selectByValue("8");
        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select(year);
        select2.selectByValue("1991");
        driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	}

}
