package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageListProdutcs extends Base {

    public PageListProdutcs(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1.h2Categoria nomeCategoria")
    private WebElement labelResultsBy;

    public String readResultsBy(){
        return labelResultsBy.getText();
    }

    public String readTitleTab (){
        return driver.getTitle();
    }

    public void clickAtDesiredProduct(String produtoDesejadoNaLista){
        driver.findElement(By.xpath("//h3[contains(., '"+produtoDesejadoNaLista+"')]")).click();
    }




}
