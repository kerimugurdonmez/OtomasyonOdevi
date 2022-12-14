package StepDef;

import Base.BasePage;
import Constants.PageElements;
import Pages.HomePage;
import Pages.SearchPage;
import com.thoughtworks.gauge.Step;
import io.grpc.netty.shaded.io.netty.util.Constant;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps extends SearchPage {



    @Step("Find and click the show more button")
    public void click() {
        scrollElement(PageElements.BUTTONOFDAHAFAZLAGOZTER);
    }
}
