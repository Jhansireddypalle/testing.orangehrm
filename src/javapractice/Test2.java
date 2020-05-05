package javapractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Test2 {
public static void main(String[] args) throws Exception{
System.setProperty("webdriver.chrome.driver" , "H:\\\\Selenium web drivers\\\\chromedriver_win32 1\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
if(driver.getTitle().equals("OrangeHRM - New Level of HR management")) {
	System.out.println("Title Matched");
}
else {
	System.out.println("Title not matched and Expected title is OrangeHRM -New Level of HR management ");
}
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed");
driver.quit();
}
}
