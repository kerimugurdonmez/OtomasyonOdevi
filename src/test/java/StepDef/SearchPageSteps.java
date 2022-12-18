package StepDef;

import Pages.SearchPage;
import com.thoughtworks.gauge.Step;


public class SearchPageSteps extends SearchPage {


    @Step("Find and click the show more button")
    public void scroll() {
        scrollDown();
    }

    @Step("Click on the first discounted product")
    public void click() throws InterruptedException {
        clickTheProduct();
    }

}
