package Driver;

import com.thoughtworks.gauge.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class Driver {


    protected static  WebDriver driver=DriverFactory.driverGetir();;
    public static JavascriptExecutor jse;
   public static Actions actions;

   @BeforeScenario
    public WebDriver getDriver() {
        jse = (JavascriptExecutor) driver;
        actions=new Actions(driver);
        return driver;
    }
    @AfterScenario
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
