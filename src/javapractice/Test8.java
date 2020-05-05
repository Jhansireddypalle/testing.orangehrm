package javapractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;


import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Test8 {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","H:\\Selenium web drivers\\chromedriver_win32 1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).clear();;
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("women jackets");
	

	Robot object = new Robot();
	
	object.keyPress(KeyEvent.VK_DOWN);
	object.keyRelease(KeyEvent.VK_DOWN);

	Thread.sleep(3000);
	
	object.keyPress(KeyEvent.VK_DOWN);
	object.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(3000);
	
	object.keyPress(KeyEvent.VK_ENTER);
	object.keyRelease(KeyEvent.VK_ENTER);

	Actions object2 = new Actions(driver);
	WebElement object3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
	object2.moveToElement(object3).perform();
	WebElement object4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a"));
	object2.moveToElement(object4).click();
	
	
	Thread.sleep(5000);
	
	driver.quit();
	}

}
