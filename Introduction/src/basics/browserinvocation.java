package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://qaclickacademy.com");
		
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		
		driver.close();
		
//		System.setProperty("webdriver.ie.driver","C:\\Automation\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("http://qaclickacademy.com");
		
	}

}
