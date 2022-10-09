import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public void loginWithValidCredentialsTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("crina.gherlea@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("11111");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.close();

    }

    public void loginWithInvalidEmail() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("crina.gherleagmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("crina.gherlea@gmail.com");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.close();
    }
}