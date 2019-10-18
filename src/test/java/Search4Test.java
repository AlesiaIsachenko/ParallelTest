import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search4Test extends TestBase{

    @ParameterizedTest
    @ValueSource(strings ={"selenium","Java"})
    void searchText1(String argument) {
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys(argument + "\n");
        wait.until(ExpectedConditions.titleIs(argument +" - Поиск в Google"));
    }

    @Test
    //@Disabled
    void searchText2() {
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(ExpectedConditions.titleIs("selenium - Поиск в Google"));

    }



}
