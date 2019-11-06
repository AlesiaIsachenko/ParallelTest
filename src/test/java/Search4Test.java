import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class Search4Test extends TestBase{

    @Tag("regress")
    @ParameterizedTest
    @ValueSource(strings ={"selenium","Java"})
    void searchText1(String argument) {
        driver.navigate().to(baseUrl);
        findText(argument);
        wait.until(urlContains(argument));
    }

    @Test
    @Disabled
    void searchText2() {
        driver.navigate().to(baseUrl);
        findText("selenium");
        wait.until(urlContains("selenium"));

    }



}
