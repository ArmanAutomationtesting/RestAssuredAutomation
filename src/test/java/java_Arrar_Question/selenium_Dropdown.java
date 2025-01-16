package java_Arrar_Question;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("www.google.com");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4000));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id());

    }

}
