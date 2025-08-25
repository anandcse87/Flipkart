package flipkart_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_testNG {
	
	@Test
	public void open_flipkart() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search_box=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search_box.sendKeys("iphone16 pro max");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("tshirts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("flipkart executed sucessfully");
	}
}
