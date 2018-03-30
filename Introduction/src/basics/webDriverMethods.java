package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isSelected());
		
	}

}
