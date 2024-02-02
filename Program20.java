
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;
public class Program20 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Automating login into NMIT LMS for ProPratheek...");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement usernametb=driver1.findElement(By.name("username"));
        usernametb.sendKeys("1nt21cs132");
        WebElement passtb=driver1.findElement(By.name("password"));
        passtb.sendKeys("Pnpp@2003");
        WebElement nextButton=driver1.findElement(By.id("loginbtn"));
        nextButton.click();
        Thread.sleep(10000);   
        driver1.quit();
        System.setProperty("webdriver.firefox.driver", "E:\\selenium\\Geckodriver\\geckodriver.exe");
        System.out.println("Automating login into NMIT LMS for ProPratheek...");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement usertb=driver.findElement(By.name("username"));
        usertb.sendKeys("1nt21cs132");
        WebElement patb=driver.findElement(By.name("password"));
        patb.sendKeys("Pnpp@2003");
        WebElement next=driver.findElement(By.id("loginbtn"));
        next.click();
        Thread.sleep(10000);   
        driver.quit();
        }
}