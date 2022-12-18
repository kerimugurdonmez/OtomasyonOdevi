package Pages;

import Base.BasePage;
import Driver.Driver;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class CommonDefinitions extends BasePage {

    public static int productBodySize;
    public static int productActualPrice;

    public void getProductBodySize()
    {
        Gauge.writeMessage("Ürün bedeni: " + productBodySize);
    }

    public void getProductActualPrice()
    {
        productActualPrice = Integer.parseInt(Driver.driver.findElement(By.cssSelector("#mainContent > div > div.container > div.row > div.col-12.col-lg-4 > div > div.product__prices > div.product__priceContent > div > span.product__price.-actual")).getText());
        Gauge.writeMessage("Ürünün şu an ki fiyatı: " + productActualPrice);
    }

}
