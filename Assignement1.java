package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sortable")).click();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		int x = item4.getLocation().getX();
		int y = item4.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		
		Actions builder = new Actions (driver);
		builder.dragAndDropBy(item1, 11,130).perform();
	}

}
