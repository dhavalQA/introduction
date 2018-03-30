package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18620/nz-vs-eng-1st-test-england-tour-of-new-zealand-2018");
		
		//Get the whole table first
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum=0;
		for (int i=0; i<count-2; i++) {
			String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInt = Integer.parseInt(value);
			sum = sum + valueInt;
		}
		
		//System.out.println(sum);
		
		String Extra = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int ExtraInt = Integer.parseInt(Extra);
		
		int TotalValue = sum + ExtraInt;
		System.out.println(TotalValue);
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
