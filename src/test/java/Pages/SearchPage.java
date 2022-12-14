package Pages;

import Base.BasePage;
import Constants.PageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage extends BasePage {

    public void scrollElement(By by) {
        jse.executeScript("scroll(0,400)");
    }
}