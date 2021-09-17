package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    WebDriver driver;
    // Launch chrome
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.simplilearn.com/");
    }

    // Start search
    public void Search() throws InterruptedException{
        driver.findElement(By.id("header_srch")).sendKeys("selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training']")).click();
        System.out.println("The page title is : " +driver.getTitle());
    }

    // close browser
    public void CloseBrowser(){
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException{
        FirstScript simpliL = new FirstScript();
        AmazonTest amazonTest = new AmazonTest();
        amazonTest.setUp();
        amazonTest.amazontest();
       /* amazonTest.tearDown();*/
/*        simpliL.LaunchBrowser();
        simpliL.Search();
        simpliL.CloseBrowser();*/
    }
}
