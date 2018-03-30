package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Udemy Section 11 : Limiting the webdriver scope.
		driver.get("https://www.ebay.com/");
		//Count of link on the entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Find the link in the footer section only
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		//Find the links in the particular footer section.
		WebElement col = driver.findElement(By.xpath("//html//div[@id='hlGlobalFooter']//td[2]/ul[1]"));
		System.out.println(col.findElements(By.tagName("a")).size());
		for (int i=0; i<col.findElements(By.tagName("a")).size(); i++) {
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());	
			String text = col.findElements(By.tagName("a")).get(i).getText();
			if(text.equals("Site map")) {
				col.findElements(By.tagName("a")).get(i).click();
			}
		}
	}

}
