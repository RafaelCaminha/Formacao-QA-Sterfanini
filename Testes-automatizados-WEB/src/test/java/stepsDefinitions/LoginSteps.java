package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.*;
import pageObjects.LoginPage;

public class LoginSteps {


    LoginPage lp = new LoginPage();

    @Quando("eu informar o usuário {string}")
    public void euInformaroUsuario(String usuario) {
        lp.informarCampoUsuario(usuario);
        
    }
    @E("informar a senha {string}")
    public void informaraSenha(String senha) {
        lp.informarCampoSenha(senha);
        
    }
    @E("clicar no botão login")
    public void clicarNoBotaoLogin() {
        lp.botaoLogin();
    }
    @Então("o sistema exibe a mensagem de usuário invalido")
    public void OSistemaExibeaMensagemUsuarioInvalido() {
        
    }

    @Então("o sistema exibe o usuário logado")
    public void sistemaExibe() {
        assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());        
    }
    
}
