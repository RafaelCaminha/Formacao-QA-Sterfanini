package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasePage {

    @FindBy(className = "select_container")
    public WebElement acionarSeletor;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement add0;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement add1;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement add2;
    @FindBy(className = "shopping_cart_link")
    public WebElement carrinho;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement remover;
    @FindBy(id = "checkout")
    public WebElement checkout;
    
    
}
