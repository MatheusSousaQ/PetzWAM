package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHome extends Base {

    public PageHome(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search")
    private WebElement fieldInputSearch;

    @FindBy(className = "button-search")
    private WebElement buttonSearch;

    public void search(String product){
        fieldInputSearch.clear();
        fieldInputSearch.sendKeys(product);
    }

    public void searchWithMagnifierButton(String product){
        search(product);
        buttonSearch.click();
    }
    public void searchWithMEnter(String product){
        search(product);
        buttonSearch.sendKeys(Keys.ENTER);
    }




}
