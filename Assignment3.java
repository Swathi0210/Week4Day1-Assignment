package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement mensFashion = driver.findElement(By.xpath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		WebElement loafers =  driver.findElement(By.xpath("//span[text()='Loafers']"));
		loafers.click();
		WebElement product = driver.findElement(By.xpath("//img[@class='product-image ']"));
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(product).perform();
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
	}

}
