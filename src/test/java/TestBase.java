import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void  setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

    public void openSite(String url) {
        driver.get(url);
    }

    protected void backStep() {
        driver.navigate().back();
    }

    protected void pause(int millis) throws InterruptedException {
        Thread.sleep(millis);
}

    protected String getPageTitle() {
        return driver.findElement(By.cssSelector("h1")).getText();
    }

    protected void clickMenuTitle(int i) {
        driver.findElement(By.xpath("//nav//li[" + i + "]")).click();
    }

    protected String getMenuTitle(int i) {
        return driver.findElement(By.xpath("//nav//li[" + i + "]")).getText();
    }
}
