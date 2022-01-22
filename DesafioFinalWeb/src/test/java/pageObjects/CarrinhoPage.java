package pageObjects;

import org.openqa.selenium.interactions.Actions;
import static utils.Utils.*;

public class CarrinhoPage extends BasePage{
    Actions acao = new Actions(driver);

    public void verCarrinho() {
       acao.moveToElement(carrinho).click().build().perform();
       
    }
    public void remover() {
        acao.moveToElement(remover).click().build().perform();
    }
    public void proxCheckout() {
        acao.moveToElement(checkout).click().build().perform();
    }
}
