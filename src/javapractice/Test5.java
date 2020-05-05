package javapractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver" , "H:\\Selenium web drivers\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		//Actions ac = new Actions(driver);
		//WebElement account_lists =
				driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();;
		//ac.moveToElement(account_lists).click();
				driver.findElement(By.name("email")).sendKeys("9515396749");
				driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
				driver.findElement(By.name("password")).sendKeys("Jhansi@1996");
				driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
				System.out.println("Login completed");
				Thread.sleep(2000);
				
		
	}

}
