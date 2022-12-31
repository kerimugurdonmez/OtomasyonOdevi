package StepDef;

import Pages.LoginPage;
import com.thoughtworks.gauge.Step;

public class LoginPageSteps extends LoginPage {

    @Step("Enter user information and login.")
    public void login() throws InterruptedException {
        userLogin();
    }
}
