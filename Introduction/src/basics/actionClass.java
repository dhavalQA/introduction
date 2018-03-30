package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		
		//Taking it into one variable
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		//Moves to Specific Element
		a.moveToElement(move).build().perform();
		
		//Enter the text in CAPS
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//Doing Right Click by using contextClick
		a.moveToElement(move).contextClick().build().perform();
	}

}
