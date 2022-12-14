package StepDef;

import Base.BasePage;
import Constants.PageElements;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;

public class CommonStepDefinitions extends BasePage {


    @Step("Click Element ceket")
    public void implementation1() {
        clickElement(PageElements.BUTTONOFDAHAFAZLAGOZTER);
    }


}
