package assignment1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
       //WebDriver edgeDriver=new EdgeDriver();
        driver.get("https://www.brimbary.com/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.titleContains("Brimbary : Home"));

        System.out.println("Page title is : "+ driver.getTitle());
         driver.quit();


    }
}