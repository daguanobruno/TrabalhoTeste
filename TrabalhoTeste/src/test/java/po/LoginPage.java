package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class LoginPage extends AkauntingPage{
    
    @FindBy(name = "email")
    WebElement loginEmail;
    
    @FindBy(name = "password")
    WebElement loginSenha;
    
    @FindBy(xpath = "/html/body/div/div[2]/form/div[3]/div[2]/button")
    WebElement loginButton;
    
     public LoginPage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.100.61");
    }
    
     public LoginPage setEmail(String email) {
        loginEmail.clear();
        loginEmail.sendKeys(email);
        return this;
    }
     
     public LoginPage setSenha(String senha) {
        loginSenha.clear();
        loginSenha.sendKeys(senha);
        return this;
    }
    
    public LoginPage Logar() {
        loginButton.click();
        return this;
    }    
}
