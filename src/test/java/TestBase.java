import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public  static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public   WebDriver driver;
    public   WebDriverWait wait;
    protected static final String baseUrl = "https://www.google.com/?hl=ru";

    @BeforeEach
    public void start() {
        if (tlDriver.get() != null) {
            driver = tlDriver.get();
            wait = new WebDriverWait(driver, 2);
           return;
        }

        driver = new ChromeDriver();
        tlDriver.set(driver);
        wait = new WebDriverWait(driver, 2);
        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null; }));
    }

    @AfterEach
    public void stop() {
        //driver.quit();
        //driver = null;
    }

    public void findText(String textToFind){
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys(textToFind + "\n");
    }

}