package cssselector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class Css {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://vijetha.in/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //using class name
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p.sc-629584ab-3"))).click();

        //using id
//        WebElement location=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("g#Home-page")));
//        Actions action=new Actions(driver);
//        action.moveToElement(location).perform();

//        //using attribute
//        WebElement cart=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/cart']")));
//        cart.click();

        //using attribute and class
        WebElement wishlist=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p.sc-629584ab-3[data-test=\"text\"]")));
        wishlist.click();



    }
}
