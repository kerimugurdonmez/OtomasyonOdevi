package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver driverGetir() {

        String browser = System.getenv("BROWSER");
        browser = (browser == null) ? "EDGE": browser;

        switch (browser) {
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments(
                        "start-maximized",
                        "disable-notifications",
                        "disable-popup-blocking",
                        "--disable-gpu");
                return new EdgeDriver(edgeOptions);
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments(
                        "start-maximized",
                        "disable-notifications",
                        "disable-popup-blocking",
                        "--disable-gpu");
                return new FirefoxDriver(firefoxOptions);
            case "CHROME":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments(
                        "start-maximized",
                        "disable-notifications",
                        "disable-popup-blocking",
                        "--disable-gpu");
                return new ChromeDriver(chromeOptions);
        }
    }
}

