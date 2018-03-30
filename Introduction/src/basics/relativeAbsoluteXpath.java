package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeAbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/");
		//Parent Child traversing concept : parent::li  : following-sibling::li[1]		
		
		System.out.println(driver.findElement(By.xpath("//a[@href='index.php'][contains(text(),'Home')]/parent::li/following-sibling::li[1]/a")).getText());
		
	}

}
