package javapractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Test7 {

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
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
	}

}
