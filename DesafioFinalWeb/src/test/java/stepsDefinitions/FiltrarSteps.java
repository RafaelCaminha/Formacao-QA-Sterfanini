package stepsDefinitions;

import static utils.Utils.*;

import pageObjects.*;
import io.cucumber.java.pt.*;

public class FiltrarSteps {

    String user = "standard_user";
    String password = "secret_sauce";
    int qtdProdutos = 3;
    

    @Dado("que estou como um usuário do site")
    public void comprarItens() {
        
    }
    @E("quero logar na aplicação")
    public void usuarioLogado() {
        Na(LoginPage.class).realizarLogin(user, password);
        Na(ProductsPage.class).acionarSeletor();
    }
    @Então("fazer a compra de 3 ou mais itens")
    public void filtrarPreco() {
       Na(ProductsPage.class).carrinho();
       Na(CarrinhoPage.class).verCarrinho();
       Na(CarrinhoPage.class).remover();
       Na(CarrinhoPage.class).proxCheckout();
       Na(Checkout.class).checkout();
    }
    
}
