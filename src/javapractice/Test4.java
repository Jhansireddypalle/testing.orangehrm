package javapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver" , "H:\\Selenium web drivers\\chromedriver_win32 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(2000);
		//mouse over
		Actions ac = new Actions(driver);
		WebElement adminmenu= driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
		ac.moveToElement(adminmenu).perform();
		Thread.sleep(2000);
		WebElement usersmenu= driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[7]/a/span"));
		ac.moveToElement(usersmenu).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[7]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@class = 'plainbtn'][@onclick='returnAdd();']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("jhansi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txtUserPassword\"]")).sendKeys("jhansi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"txtUserConfirmPassword\"]")).sendKeys("jhansi");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtUserEmpID\"]")).sendKeys("jhansi");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"editBtn\"]")).click();
		driver.switchTo().defaultContent();
		//System.out.println("clicked on submenu");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.quit();
	}
}
