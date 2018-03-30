package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//Select the month first
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")){
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		//Select the date you want in the month you selected
		//List<WebElement> list = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for(int i=0; i<count; i++) {
			//System.out.println(driver.findElements(By.className("day")).get(i).getText());
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("29")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
	}

}
