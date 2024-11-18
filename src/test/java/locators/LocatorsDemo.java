package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://vijetha.in/");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //using name locators:
//        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search-string")));
//        search.sendKeys("bread");
//
//        //using ID locator:
//        WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user")));
//        Actions action = new Actions(driver);
//        action.moveToElement(profile).perform();
//
//
//
//        //using linktext and partial link text.
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Fruits & Vegetables"))).click();
//
//
//        //using partial link text
//        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Dairy, Bread"))).click();

        //using class name: for group of elements
        //whenever we are capturing multiple webelements:

//         List<WebElement> headerLinks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("sc-62a82cfd-1")));
//        System.out.println("Count of the header links: " + headerLinks.size());

        //using tag name:
        List<WebElement> total_imgs=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("img")));
        System.out.println("Total number os images: "+total_imgs.size());


        List<WebElement> total_links=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
        System.out.println("Total number of links: "+total_links.size());






        // //button[normalize-space()='Sign in']
        // .sc-a4d76935-0.sc-159eb829-4.sc-159eb829-5.jFTjyj
        // (//button[normalize-space()='Sign in'])[1]
        // sc-a4d76935-0 sc-159eb829-4 sc-159eb829-5 jFTjyj
        // /html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/button[1]


    }
}
