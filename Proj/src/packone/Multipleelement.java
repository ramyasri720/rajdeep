package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Multipleelement {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");

		driver.manage().window().maximize();
	List<WebElement>links_count=driver.findElements(By.tagName("a"));
	int i;
	for(i=0;i<links_count.size();i++);
	System.out.println(links_count.get(i).getText());
	
	
		
	}

}
