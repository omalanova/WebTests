import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
    @Test
    public void testGetSum() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "D:/workJava/chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);

        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
//
//        WebElement username = driver.findElement(By.id("user_email_login"));
//        WebElement password = driver.findElement(By.id("user_password"));
//        WebElement login = driver.findElement(By.name("commit"));
//
//        username.sendKeys("abc@gmail.com");
//        password.sendKeys("your_password");
//        login.click();
//
//        String actualUrl = "https://live.browserstack.com/dashboard";
//        String expectedUrl = driver.getCurrentUrl();
//
//        Assert.assertEquals(expectedUrl, actualUrl);
        driver.close();
        driver.quit();
    }
}
