package condition;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import constants.Constants;

public class ConditionMethods {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.poptopia.in/");
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@href=\"/login\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Enter your email or phone number*\"]"))).sendKeys(Constants.mobile);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Password*\"]"))).sendKeys(Constants.password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='login']"))).click();



    }
}
