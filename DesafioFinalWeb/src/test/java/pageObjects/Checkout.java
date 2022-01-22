package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class Checkout extends BasePage{
    Actions acao = new Actions(driver);

    @FindBy(id = "first-name")
    private WebElement first;
    @FindBy(id = "last-name")
    private WebElement last;
    @FindBy(id = "postal-code")
    private WebElement zip;
    @FindBy(id = "continue")
    private WebElement cont;
    @FindBy(id = "cancel")
    private WebElement cancel;

    public void first() {
        first.sendKeys("First");
    }
    public void last() {
        last.sendKeys("Last");
    }
    public void zip() {
        zip.sendKeys("62823-000");
    }
    public void prox() {
        acao.moveToElement(cont).click().build().perform();
    }
    public void cancelar() {
        acao.moveToElement(cancel).click().build().perform();
    }

    public void checkout() {
        first();
        last();
        zip();
        prox();
        cancelar();
    }


}
