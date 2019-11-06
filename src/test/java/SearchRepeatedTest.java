import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class SearchRepeatedTest extends TestBase{
    @Test
    @Tag("smoke")
    @Tag("regress")
    @RepeatedTest(2)
    void searchText1() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));
    }

    @Test
    @Disabled
    public void searchText2() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));

    }
}
