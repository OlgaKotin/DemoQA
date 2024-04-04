package tests.hardcoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void testElementsPage() {
        // TODO with webdrivermanager
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://demoqa.com/");
//        WebElement elementText = driver
//                .findElement(By.xpath("//h5[text()='Elements']"));
//        elementText.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".card-body\").click();");

        String urlActualRes = driver.getCurrentUrl();

        Assert.assertEquals(urlActualRes, "https://demoqa.com/elements",
                "url's not equal");
        driver.quit();
    }
}
