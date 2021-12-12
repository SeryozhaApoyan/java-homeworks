package Automation;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lesson1 {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        WebElement elem = driver.findElement(By.id("message9"));
        //Thread.sleep(1000);
        elem.clear();
       // Thread.sleep(1000);
        elem.sendKeys("sergo.apoyan@gmail.com");
        //Thread.sleep(1000);
        driver.findElement(By.cssSelector("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
        String login = "mngr373680";
        String pass = "sEmUdyd";
       // Thread.sleep(1000);
        driver.get("http://demo.guru99.com/V4/");
        WebElement elem1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));

        elem.sendKeys(login);
        WebElement elem2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        elem.sendKeys(pass);


        //Thread.sleep(2000);
        driver.quit();
    }
}
