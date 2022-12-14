package Pages;

import Base.BasePage;
import com.thoughtworks.gauge.Step;

public class CommonStepDefinition extends BasePage {


    @Step("Navigate To <Url>")
    public void navigateUrl(String key){
        goToUrl(key);
    }

}
