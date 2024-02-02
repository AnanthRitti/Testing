
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App_login {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/shankark/5th sem/aec soft testing/aec/src/driver/chromedriver-mac-arm64/chromedriver");
        System.out.println("Automating login into NMIT LMS for ProPratheek...");
        WebDriver driver = new ChromeDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement usernametb=driver.findElement(By.name("username"));
        usernametb.sendKeys("1nt21cs161");
        WebElement passtb=driver.findElement(By.name("password"));
        passtb.sendKeys("Shankar##123");
        WebElement nextButton=driver.findElement(By.id("loginbtn"));
        nextButton.click();
        Thread.sleep(10000);    
        driver.quit();
        }
}
  