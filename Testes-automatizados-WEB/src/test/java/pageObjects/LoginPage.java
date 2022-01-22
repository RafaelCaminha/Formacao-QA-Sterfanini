package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginPage {
    
    public void informarCampoUsuario(String user) {
        
        driver.findElement(By.name("txtUsername")).sendKeys(user);

    }
    public void informarCampoSenha(String senha) {
        
        driver.findElement(By.name("txtPassword")).sendKeys(senha);

    }
    public void botaoLogin() {
        
        driver.findElement(By.name("Submit")).click();

    }
}

