package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */

public class Login extends BasePage{

    @FindBy(name = "email")
    WebElement loginEmail;
    
    @FindBy(name = "password")
    WebElement loginSenha;
    
    @FindBy(xpath = "/html/body/div/div[2]/form/div[3]/div[2]/button")
    WebElement loginButton;

    public Login(WebDriver driver) {
        super(driver);
    }
    
     public Login setEmail(String email) {
        loginEmail.clear();
        loginEmail.sendKeys(email);
        return this;
    }
     
     public Login setSenha(String senha) {
        loginSenha.clear();
        loginSenha.sendKeys(senha);
        return this;
    }
    
    public Login Logar() {
        loginButton.click();
        return this;
   }

}

