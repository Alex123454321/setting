import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TESTIK1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://vs7.io/");
		selenium.start();
	}

	@Test
	public void test123() throws Exception {
		selenium.open("http://tinko.rtz.io/");
		selenium.waitForPageToLoad("20000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
