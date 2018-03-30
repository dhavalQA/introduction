package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class webUIControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		//driver.manage().window().maximize();
		
		//Static Dropdown
//		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		s.selectByValue("2");
//		s.selectByIndex(4);
//		s.selectByVisibleText("9");
		
		//Dynamic DropDown
//		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='GOI']")).click();
//		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		
		//CheckBoxes
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
//		driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
		
		//Radio Buttons
		//driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
		//If we don't have any unique attribute like(value='RoundTrip') in the list then how we will click on certain index?
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
		int Count = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		
		for(int i=0; i<=Count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			if(text.equals("TripPlanner")) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
				break;
			}
		}
		
		// Handling webpage Alerts
		driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();
		
		//Handling Java Alerts -- Sample Code from Udemy
//		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
//		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept(); //Accept = ok done yes
//		//driver.switchTo().alert().dismiss();
//		//driver.switchTo().alert().sendKeys("fesfe");
		
				
	}

}
