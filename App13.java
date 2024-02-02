 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/shankark/5th sem/aec soft testing/aec/src/driver/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("facebook");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
    
        driver.navigate().refresh();
        driver.navigate().back();
        // Wait for some time to allow the video page to load
        driver.findElement(By.name("q")).sendKeys("instagram");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://www.instagram.com");
        driver.findElement(By.name("username")).sendKeys("test@gmail.com");
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().forward();

        driver.quit();
        
    }
}
//13 Navigation Scenario

