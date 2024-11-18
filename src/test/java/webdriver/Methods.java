package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;


public class Methods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.screener.in/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean res=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"Screener logo\"]"))).isDisplayed();
        System.out.println(res);
        //get()-open the url in the chrome browser.
        //getTitle()= return the title of the current web page
        //getCurrentUrl() = returns the URL of the code.
        //getPageSource()=return source code of the page.
        //getWindowHandle() = returns ID of the single browser window.
        //getWindowHandles() = returns ID's of the multiple browser window.

//        String url=driver.getCurrentUrl();
//        System.out.println(url);
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getWindowHandles());

        //conditional methods
        boolean search=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"Search for a company\"]"))).isEnabled();
        System.out.println(search);
        driver.get("https://www.screener.in/");
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About us"))).click();

        driver.close();


    }
}
