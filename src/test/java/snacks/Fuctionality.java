package snacks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Fuctionality {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://vijetha.in/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        //tagname and total count and print it
        List<WebElement> totallinks=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
        System.out.println("Total Number of: "+totallinks.size());
        for(WebElement link:totallinks){
            String href=link.getAttribute("href");
            if(href!=null && !href.isEmpty()){
                System.out.println(href);
            }
        }

        // image count
        List<WebElement> total_imgs=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("img")));
        System.out.println("Total images count: "+total_imgs.size());

        //link text
        WebElement alink=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Privacy Policy")));
        alink.click();

        //partial link text
        WebElement parlink=wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Terms ")));
        parlink.click();


    }


}
