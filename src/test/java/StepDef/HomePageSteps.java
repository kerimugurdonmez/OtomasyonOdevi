package StepDef;

import Constants.PageElements;
import Pages.HomePage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePageSteps extends HomePage {

    @Step("Navigate To <Url>")
    public void navigateUrl(String key) {
        goToUrl(key);
    }

    @Step("Close the cookie pop-up")
    public void close() {
        closeCookie();
    }

    @Step("Search <product>")
    public void search(String product) {
        searchTheProduct();
    }

    @Step("Click my cart icon")
    public void icon() {
        clickTheCartIcon();
    }

    @Step("Remove product from cart")
    public void remove() {
        removeProduct();

    }
}
