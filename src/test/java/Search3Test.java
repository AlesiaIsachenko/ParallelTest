import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class Search3Test extends TestBase{
    @Tag("smoke")
    @Test
    public void searchText1() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));
        assertEquals(2, 2);
    }

    @Test
    @Tag("regress")
    public void searchText2() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));
<<<<<<< HEAD
        WebElement element = driver.findElement(By.cssSelector("[name=qa]"));
=======
>>>>>>> master
    }
    @Test
    @Tag("regress")
    public void searchText3() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));
    }
}
