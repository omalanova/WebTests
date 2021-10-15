import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Site1Test2timeout {

    @Test
    public void testGetSum() {
        System.setProperty("webdriver.chrome.driver", "D:/workJava/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            driver.manage().window().maximize();

            driver.get("https://www.browserstack.com/users/sign_in");

            WebElement username = driver.findElement(By.id("user_email_login"));
            WebElement password = driver.findElement(By.id("user_password"));
            WebElement login = driver.findElement(By.name("commit"));

            username.sendKeys("abc@gmail.com");
            password.sendKeys("your_password");
            login.click();

            WebElement error = driver.findElement(By.id("bs-alert-text-id"));
            Assert.assertEquals(error.getText(), "There have been several failed attempts to sign in from this account. Please wait a while and try again later.");
        } finally {
            driver.quit();
        }

    }
}