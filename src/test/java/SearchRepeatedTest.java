import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class SearchRepeatedTest extends TestBase{
    @Test
    @RepeatedTest(2)
    public void searchText1() {
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(urlContains("selenium"));
    }

    @Test
    @Disabled
    public void searchText2() {
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(urlContains("selenium"));

    }
}
