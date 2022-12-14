package Driver;

import com.thoughtworks.gauge.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class Driver {

    // Holds the WebDriver instance
    protected static  WebDriver driver=DriverFactory.driverGetir();;
    public static JavascriptExecutor jse;
   public static Actions actions;

    public WebDriver getDriver() {
        jse = (JavascriptExecutor) driver;
        actions=new Actions(driver);
        return driver;
    }


    // Initialize a webDriver instance of required browser
    // Since this does not have a significance in the application's business domain, the BeforeSuite hook is used to instantiate the webDriver


    // Close the webDriver instance
    @AfterScenario
    public void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
