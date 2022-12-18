package StepDef;

import Base.BasePage;
import Constants.PageElements;
import Pages.CommonDefinitions;
import com.thoughtworks.gauge.Step;

public class CommonSteps extends CommonDefinitions {


    @Step("Check that the size and price information of the product is correct in the basket.")
    public void check() throws InterruptedException {
        getProductBodySize();
        Thread.sleep(500);
        getProductActualPrice();
    }
}
