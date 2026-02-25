package myjava.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetVtigerLogin {

	@Test
	public void test_001_login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91933/OneDrive/Desktop/NameDemo.html");
		//Login
		driver.findElement(By.xpath("//input[@name='User Name']")).sendKeys("Shailesh");
		// Email
		driver.findElement(By.xpath("//input[@name='User Password']")).sendKeys("engineershailesh226@gmail.com");
		// Password
		driver.findElement(By.linkText("Playwrigth Automation")).click();
		driver.findElement(By.linkText("Playwrigth Automation")).sendKeys(Keys.ENTER);
		// Submit
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
