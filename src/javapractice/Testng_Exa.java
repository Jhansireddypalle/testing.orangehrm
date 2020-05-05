package javapractice;
import org.testng.annotations.*;
public class Testng_Exa {

	@BeforeClass
	public void openApplication() {
		System.out.println("it comes 1st");
	}
	@AfterClass
	public void closed() {
		System.out.println("closed");
	}
	@Test
	public void testing() {
	System.out.println("test");	
	}
	@Test
	public void testing1111() {
	System.out.println("test");	
	}
	
}
