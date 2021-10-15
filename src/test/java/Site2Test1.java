import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Site2Test1 {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/workJava/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void setDown() {
//        driver.quit();
//    }

    @Test
    public void testRegister() {

        driver.get("https://na.eventscloud.com/ereg/newreg.php?eventid=538072&");

        try {
            WebElement email = driver.findElement(By.id("email"));
            WebElement step1 = driver.findElement(By.name("reg_button"));
            WebElement checkbox1 = driver.findElement(By.id("ch57539472_38471402_1"));
            WebElement checkbox2 = driver.findElement(By.id("ch57539472_38471402_2"));
            WebElement checkbox3 = driver.findElement(By.id("ch57539472_38471402_3"));
            WebElement ln = driver.findElement(By.id("q57539472_lname"));
            WebElement fn = driver.findElement(By.id("q57539472_fname"));
            WebElement ln_ch = driver.findElement(By.id("q57539472_38018037"));
            WebElement fn_ch = driver.findElement(By.id("q57539472_38018040"));
            WebElement age_ch = driver.findElement(By.id("q57539472_38018038"));
            WebElement phone = driver.findElement(By.id("q57539472_mphone"));
            WebElement checkbox4 = driver.findElement(By.id("ch57539472_38074879"));

            email.sendKeys("test@gmail.com");
            step1.click();

            String URL1 = driver.getCurrentUrl();
            Assert.assertEquals(URL1, "https://na.eventscloud.com/ereg/attendeeinfo.php?eventid=538072");

            checkbox1.click();
//            checkbox2.click();
//            checkbox3.click();
//            if (!checkbox1.isSelected()) {
//                checkbox1.click();
//            }
//            ln.sendKeys("Smith");
//            fn.sendKeys("John");
//            ln_ch.sendKeys("Smith");
//            fn_ch.sendKeys("Bob");
//            age_ch.sendKeys("12");
//            phone.sendKeys("88005554422");
//            checkbox4.click();
//            step1.click();
//
//            String URL2 = driver.getCurrentUrl();
//            Assert.assertEquals(URL2, "https://na.eventscloud.com/ereg/record.php?id=aea166831a8ef41e1fa6883c78f6116f-MjAyMS0xMCM2MTViMGFhYzc3MDY0&va_token=3000699ef1");

        } finally {
            driver.quit();
        }
    }

//    @Test
//    public void testNewPassword() {
//        driver.get("https://www.browserstack.com/users/sign_in");
//
//        WebElement link = driver.findElement(By.linkText("Forgot password?"));
//        link.click();
//
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.browserstack.com/users/password/new");
//    }
}
