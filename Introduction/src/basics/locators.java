package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dhavalpatel@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		//driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Please enter your email or phone number to search ')]")).getText());
		//div[contains(text(),'Please enter your email or phone number to search ')]
	
		//*[@id="homepage"]/header/div[2]/div/nav/ul/li[1]/a
		
		
	}

}
