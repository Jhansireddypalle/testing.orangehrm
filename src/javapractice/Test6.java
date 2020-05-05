package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertTrue;


public class Test6 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver" , "H:\\Selenium web drivers\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		System.out.println("Excution should be stop");
		assertTrue(driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome admin"));
		
		Actions ac = new Actions(driver);
		WebElement pimmenu = driver.findElement(By.linkText("PIM"));
		ac.moveToElement(pimmenu).perform();
		System.out.println("Mouse over completed");
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		
		driver.quit();
	}
}
