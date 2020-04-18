package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductLogPage
{
    public WebDriver driver;

    public ProductLogPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By search = By.xpath(".//input[@type='search']");
    By ProductName = By.cssSelector("h4.product-name");
    By addtoCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
    By cartIcon = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");

    public WebElement getSearch()
    {
        return driver.findElement(search);
    }

    public WebElement getProductName()
    {
        return driver.findElement(ProductName);
    }

    public WebElement getAddtoCart()
    {
        return driver.findElement(addtoCart);
    }

    public WebElement getCartIcon()
    {
        return driver.findElement(cartIcon);
    }

}
