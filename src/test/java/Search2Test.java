import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Tag("123")
public class Search2Test extends TestBase{

    @Test
    public void searchText1 (){
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(ExpectedConditions.titleIs("selenium - Поиск в Google"));

    }
    @Test
    public void searchText2 (){
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(ExpectedConditions.titleIs("selenium - Поиск в Google"));

    }
    @Test
    public void searchText3 (){
        driver.navigate().to("https://www.google.com/?hl=ru");
        WebElement element = driver.findElement(By.cssSelector("[name=q]"));
        element.sendKeys("selenium" + "\n");
        wait.until(ExpectedConditions.titleIs("selenium - Поиск в Google"));

    }
}


