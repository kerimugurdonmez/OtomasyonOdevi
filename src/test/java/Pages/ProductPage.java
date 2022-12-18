package Pages;

import Base.BasePage;
import Constants.PageElements;
import com.thoughtworks.gauge.Gauge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class ProductPage extends BasePage
{
    Random random = new Random();


    public void randomSize() throws InterruptedException {

        int randomBodySize;
        WebElement element;

            randomBodySize = random.nextInt(8);
            element = findElement(By.xpath("(//div[@class='product__size radio-box'])["+randomBodySize+"]"));
            element.click();
            if (element.isSelected())
            {
                clickElement(PageElements.BUTTONOFADDTOCART);
            }
            else
            {
                random.nextInt(8);
            }



    }

    public void goToCart()
    {
        clickElement(PageElements.BUTTONOFGOTOCART);

    }


}
