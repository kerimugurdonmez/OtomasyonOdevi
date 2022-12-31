package StepDef;

import Pages.CartPage;
import com.thoughtworks.gauge.Step;

public class CartPageSteps extends CartPage {
    @Step("Click the continue button.")
    public void click()
    {
        clickContinue();
    }
}
