package sauceOrder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class PurchaseItem {
	public static ChromeDriver driver;
	public static WebDriverWait wait;
	@Test
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Test");;
		driver.findElement(By.id("last-name")).sendKeys("1");
		driver.findElement(By.id("postal-code")).sendKeys("123456");;
		driver.findElement(By.id("continue")).click();
		String orderid = driver.findElement(By.xpath("(//div[@class='summary_value_label'])[1]")).getText();
		String[] split = orderid.split("#");
		System.out.println("Order id: " +split[1]);
		driver.close();
		System.out.println("sauceOrder");
		
		

	}


}
