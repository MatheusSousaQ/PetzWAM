package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import general.Base;
import org.openqa.selenium.WebDriver;
import pages.PageHome;
import pages.PageListProdutcs;
import pages.PageProducts;

import static org.junit.Assert.assertEquals;

public class SearchProduct extends Base {

    private Base base;
    private PageHome pageHome;
    private PageListProdutcs pageListProdutcs;
    private PageProducts pageProducts;

    public SearchProduct(WebDriver driver, Base base) {
        super(driver);
        this.base = base;
    }

    @Given("^I acces Petz homepage$")
    public void iAccesPetzHomepage() {
        base.driver.get("https://www.petz.com.br/");
    }

    @When("^search \"([^\"]*)\"$")
    public void search(String product) {
         pageHome.searchWithMEnter(product);
    }

    @Then("^see list of product \"([^\"]*)\"$")
    public void seeListOfProduct(String product) {
        assertEquals(product + " - Produtos pet em promoção | Petz", pageListProdutcs.readTitleTab());

        assertEquals("RESULTADOS PARA \"" + product + "\"", pageListProdutcs.readResultsBy());
    }

    @And("^acces at produt \"([^\"]*)\"$")
    public void accesAtProdut(String product) {
        pageListProdutcs.clickAtDesiredProduct(product);
    }

    @Then("^show the title \"([^\"]*)\" and price \"([^\"]*)\"$")
    public void showTheTitleAndPrice(String product, String price) {
        assertEquals(product = " | Petz", pageProducts.readTitleTab());
        assertEquals(price, pageProducts.readPriceProdutc());
        assertEquals(product, pageProducts.readProductTitle());
    }
}
