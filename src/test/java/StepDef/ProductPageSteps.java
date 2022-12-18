package StepDef;

import Pages.ProductPage;
import com.thoughtworks.gauge.Step;

public class ProductPageSteps extends ProductPage
{

    @Step("Choose random size and add to cart")
    public void size() throws InterruptedException {
        randomSize();
    }

    @Step("Click the Go to Cart button in the lower right corner.")
    public void cart()
    {
        goToCart();
    }
}
