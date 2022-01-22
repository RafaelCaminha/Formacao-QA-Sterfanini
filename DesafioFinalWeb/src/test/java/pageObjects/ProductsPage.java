package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static utils.Utils.*;

public class ProductsPage extends BasePage {

    Actions acao = new Actions(driver);
    
    public void acionarSeletor() {
       acao.moveToElement(acionarSeletor).click().build().perform();
       WebElement seletorObject = driver.findElement(By.className("product_sort_container"));
       Select seletor = new Select(seletorObject);
       seletor.selectByValue("lohi");
    }
    public void carrinho() {
        acao.moveToElement(add0).click().build().perform();
        acao.moveToElement(add1).click().build().perform();
        acao.moveToElement(add2).click().build().perform();
       
    }

}

