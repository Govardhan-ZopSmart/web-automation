package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbsXpath {
    // /html/body/div[1]/main/div[2]/div[2]/div[1]/a/div/div/img
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://vijetha.in/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div[1]/a/div/div/img"))).click();

        //relative xpath: with single attribute
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title=\"Must Have Picks\"]"))).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"search-string\"][@placeholder=\"What are you looking for...\"]"))).sendKeys("Bread");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='FAQs']"))).click();


        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Milk']"))).click();


        // driver.get("https://vijetha.in/category/milk");
//        boolean disp=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Add to cart']"))).isDisplayed();
//        System.out.println(disp);

//        String sweet=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sweets & Chocolates']"))).getText();
//        System.out.println(sweet);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Add to cart\"]"))).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Type address')]"))).sendKeys("hyderabad");
//
//        driver.get("https://vijetha.in/cart");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(text(),'Proceed to Checkout')]"))).click();

        // xpath with start-with()
//        driver.get("https://vijetha.in/checkout");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@placeholder,'Na')]"))).click();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Oral Care']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[starts-with(text(),'Tea')]"))).click();

        Boolean isimage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test='img']/img"))).isDisplayed();
        System.out.println(isimage);






    }
}
