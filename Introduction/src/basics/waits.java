package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/?semid=eef8babd-df0d-4660-8ee5-8ae7d70dda3e::20467322::||Evergreen||&gclid=Cj0KCQjwy9LVBRDOARIsAGqoVntN7tsOS6zMkbTE5KH5XGR9nCNvPz_u00j0DuwNmng3WTiD81MgAvUaAraQEALw_wcB");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@id='tab-hotels']")).click();
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='hotelFromDate']")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver, 10);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href='New-York-Hotels-Park-Central-Hotel')]")));
		driver.findElement(By.xpath("//a[contains(@href='New-York-Hotels-Park-Central-Hotel')]")).click();
		
	}

}
