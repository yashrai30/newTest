package Demo.Dummy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

	WebDriver driver = WebDriverManager.chromedriver().create();
    @Before
    public void setUp() {
        // Specify the path to your ChromeDriver executable
    	// System.setProperty("webdriver.chrome.driver", "Utilities/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        
    }

    @Test
    public void openFlipkart() {
        // Open the Flipkart website
        driver.get("https://www.flipkart.com/");
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}