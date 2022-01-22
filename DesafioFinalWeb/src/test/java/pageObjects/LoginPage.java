package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "user-name")
	private WebElement user;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement botaoLogin;
	
	public void informarCampoUsuario(String usuario) {
		user.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) {
		password.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
}
