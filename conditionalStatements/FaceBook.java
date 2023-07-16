
package conditionalStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Coimbatore");
		driver.findElement(By.id("dest")).sendKeys("Srivilliputhur");
		driver.findElement(By.className("sc-kAzzGY dYHzlP")).click();
		driver.findElement(By.className("dateText")).click();
		
		driver.findElement(By.id("search_button")).click();
		
		
	}

}
