package javapractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.Lanch Browser//
System.setProperty("webdriver.chrome.driver" , "H:\\Selenium web drivers\\chromedriver_win32 1\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");

Actions object = new Actions(driver);
WebElement admin_menu = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
object.moveToElement(admin_menu).perform();
WebElement company_info = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span"));
object.moveToElement(company_info).perform();
driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/ul/li[1]/a/span")).click();
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//*[@id=\"editBtn\"]")).click();
driver.findElement(By.xpath("//*[@id=\"editBtn\"]")).click();
Alert object_alert = driver.switchTo().alert();
object_alert.accept();

driver.switchTo().defaultContent();




driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
	}

}
