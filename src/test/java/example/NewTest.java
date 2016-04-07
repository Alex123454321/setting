package example;

       import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;    
import com.thoughtworks.selenium.*;
public class NewTest {
	private Selenium selenium;

	@BeforeTest
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://vs7.io/");
		selenium.start();
	}

	@Test
	public void test123() throws Exception {
		selenium.open("http://tinko.rtz.io/");
		selenium.waitForPageToLoad("20000");
	}

	@AfterTest
	public void tearDown() throws Exception {
		selenium.stop();
	}
}