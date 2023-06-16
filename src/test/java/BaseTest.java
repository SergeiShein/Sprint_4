import io.github.bonigarcia.wdm.WebDriverManager;
import constants.DriverConstants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(DriverConstants.ORDER_TEST_URL);
    }
    @After
    public void tearDown() {
        // Закрыть браузер
        driver.quit();
    }
}
