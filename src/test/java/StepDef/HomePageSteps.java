package StepDef;

import Base.BasePage;
import Pages.HomePage;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps extends HomePage {

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() {
        WebElement getStartedButton = findElement(By.xpath("//a[@href='https://docs.gauge.org/getting_started/installing-gauge.html']"));
        getStartedButton.click();

        Gauge.writeMessage("Page title is %s", getDriver().getTitle());
    }

    @Step("Ensure installation instructions are available")
    public void ensureInstallationInstructionsAreAvailable() {
        WebElement instructions = findElement(By.xpath("//a[@href='/writing-specifications.html']"));
        assertThat(instructions).isNotNull();
    }


    @Step("Close the cookie pop-up")
    public void close() {
        closeCookie();
    }

    @Step("Search <product>")
    public void search(String product)
    {
     findElement(By.xpath("//*[@id='search']")).click();
     findElement(By.xpath("//*[@id='search']")).sendKeys(product,Keys.ENTER);
    }

}
