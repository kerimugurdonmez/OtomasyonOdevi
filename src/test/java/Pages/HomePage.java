package Pages;

import Base.BasePage;
import Constants.PageElements;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {

    public void closeCookie(){
        clickElement(PageElements.COOKIE);
    }
}
