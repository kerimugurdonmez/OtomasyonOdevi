package Constants;

import Base.BasePage;
import org.openqa.selenium.By;

import java.util.Random;

public class PageElements extends BasePage {

    static int randomNumber = random.nextInt(120);

    public static final By COOKIE = By.id("onetrust-accept-btn-handler");
    public static final By SEARCHBOX = By.xpath("//*[@id='search']");
    public static final By BUTTONOFDAHAFAZLAGOZTER = By.xpath("//button[@class='button -secondary -sm relative' and 'Daha fazla göster']");

    public static final By THEPRODUCT = By.xpath("(//div[@class='products__item col-6 col-md-4'])[" + randomNumber + "]");

    public static final By BUTTONOFADDTOCART = By.xpath("//*[@id='mainContent']/div/div[1]/div[2]/div[2]/div/div[7]/button[2]");
    public static final By BUTTONOFGOTOCART = By.xpath("//*[@id='header__desktopBasket']/div/div[3]/a");
    public static final By RADIOBUTTON = By.xpath("//div[@class='product__size radio-box']/label[@class='radio-box__label'][not(@disabled)]");
    public static final By CONTINUE = By.xpath("//button[@class='continueButton n-button large block text-center -primary']");
    public static final By USEREMAIL = By.id("n-input-email");
    public static final By USERPASS = By.id("n-input-password");
    public static final By LOGINBUTTON = By.xpath("//*[@id='login']/button");
    public static final By LOGO = By.xpath("//a[@class='header__logo']");
    public static final By MYCARTICON = By.xpath("//div[@class='header__basket js-basket header__basketLink']");
    public static final By REMOVE = By.xpath("//div[@class='header__basketProductBtn header__basketModal -remove']");




}
