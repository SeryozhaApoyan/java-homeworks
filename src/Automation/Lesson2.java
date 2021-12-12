package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Time;
import java.time.Duration;
import java.util.List;
public class Lesson2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("Java");
        searchInput.submit();
        List<WebElement> result = driver.findElements(By.cssSelector
                ("span[class ^= 'a-size-base-plus']"));
        for (int i = 0; i < result.size(); i++){
            if (result.get(i).getText().contains("Java")){
                //Thread.sleep(2000);
                System.out.println("LAVA LAVA -------- " + result.get(i).getText());
            }
        }
        driver.quit();
    }

}
