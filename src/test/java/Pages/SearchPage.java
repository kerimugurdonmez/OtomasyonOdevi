package Pages;

import Base.BasePage;
import Constants.PageElements;
import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class SearchPage extends BasePage {



    public void scrollDown()
    {
        WebElement element = Driver.driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button"));
        element.sendKeys(Keys.DOWN);
        element.click();
    }

    public void clickTheProduct() throws InterruptedException {
        actions.sendKeys(Keys.DOWN);
        Thread.sleep(500);
        clickElement(PageElements.THEPRODUCT);
    }



}