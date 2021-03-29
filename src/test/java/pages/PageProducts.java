package pages;

import general.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageProducts extends Base {

    public PageProducts(WebDriver driver) {
        super(driver);
    }

    public String readTitleTab() {
        return driver.getTitle();
    }

    @FindBy(css = "div.col-md-7.prod-info:nth-child(6) > h1:nth-child(1)")
    private WebElement productTitle;

    public String readProductTitle(){
        return productTitle.getText();
    }

    @FindBy(css = "div.price-current")
    private WebElement price;

    public String readPriceProdutc(){
        return price.getText();
    }
}