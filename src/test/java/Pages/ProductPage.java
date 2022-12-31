package Pages;

import Base.BasePage;
import Constants.PageElements;
import Driver.Driver;
import com.thoughtworks.gauge.Gauge;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends BasePage
{



    public void randomSize() {

        /*int randomBodySize;
        WebElement element;

           randomBodySize = random.nextInt(4);

            element = Driver.driver.findElement(By.xpath("(//div[@class='product__size radio-box']/label[@class='radio-box__label'][not(@disabled)])[" + randomBodySize + "]"));
            element.sendKeys(Keys.DOWN);
        element.click();*/

        List <WebElement> webElements = Driver.driver.findElements(PageElements.RADIOBUTTON);
        int elementSize = random.nextInt(webElements.size());
        webElements.get(elementSize).click();
        clickElement(PageElements.BUTTONOFADDTOCART);
    }

    public void goToCart()
    {
        clickElement(PageElements.BUTTONOFGOTOCART);

    }


}
