package Pages;

import Base.BasePage;
import Constants.PageElements;
import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {

    public void closeCookie(){
        clickElement(PageElements.COOKIE);
    }

    public void searchTheProduct()
    {
        Driver.driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        Driver.driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Ceket",Keys.ENTER);
    }

}
