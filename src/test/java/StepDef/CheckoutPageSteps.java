package StepDef;

import Pages.CheckoutPage;
import com.thoughtworks.gauge.Step;

public class CheckoutPageSteps extends CheckoutPage {
    @Step("Return to home page")
    public void homePage() {
        returnToHomePage();
    }
}
