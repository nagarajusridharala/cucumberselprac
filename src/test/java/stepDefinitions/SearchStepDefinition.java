package stepDefinitions;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.ProductLogPage;
import Cucumber.Automation.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchStepDefinition extends Base
{
    public WebDriver driver;
    ProductLogPage pp;
    CartPage cp;
    CheckoutPage chkp;

    @Given("^User is on Product Log Page$")
    public void user_is_on_Product_Log_Page() throws Throwable
    {
        driver = Base.getDriver();
        pp = new ProductLogPage(driver);
        cp = new CartPage(driver);
        chkp = new CheckoutPage(driver);
    }

    @When("^User enter product name (.+) in Searh box$")
    public void user_enter_product_name_in_Searh_box(String arg1) throws Throwable
    {
        pp.getSearch().sendKeys(arg1);
        Thread.sleep(3000);

    }

    @Then("^Product \"([^\"]*)\" is seachble$")
    public void product_is_seachble(String arg1) throws Throwable
    {
        Assert.assertTrue(pp.getProductName().getText().contains(arg1));
    }

    @Then("^Verify product (.+) displayed in cart$")
    public void verify_product_something_displayed_in_cart(String strArg1) throws Throwable
    {
        Assert.assertTrue(chkp.getproductName().getText().contains(strArg1));
    }

    @And("^Add Items to cart$")
    public void add_items_to_cart() throws Throwable
    {
        pp.getAddtoCart().click();
        Thread.sleep(1000);
    }

    @And("^Procced to Checkout page$")
    public void procced_to_checkout_page() throws Throwable
    {
        pp.getCartIcon().click();
        cp.getProceedtoChkoutBtn().click();
        Thread.sleep(1000);
    }
}
