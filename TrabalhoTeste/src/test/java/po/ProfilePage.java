/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class ProfilePage extends AkauntingPage{
    
    @FindBy(id = "name")
    WebElement name;
    
    @FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "password_confirmation")
    WebElement password_confirmation;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[5]/div/span/span[1]/span/span[2]")
    WebElement verIdiomas;
    
    @FindBy( xpath = "//*[@id=\"locale\"]/option[20]")
    WebElement idioma;
    
    @FindBy( xpath = "//*[@id=\"locale\"]/option[2]")
    WebElement idioma2;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[2]/div/div/button")
    WebElement save;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div[1]")
    WebElement mensagem;
    
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    
    public ProfilePage setNome(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }
    
    public ProfilePage setSenha(String senha) {
        password.clear();
        password.sendKeys(senha);
        return this;
    }
    
    public ProfilePage setConfirmarSenha(String conf_senha) {
        password_confirmation.clear();
        password_confirmation.sendKeys(conf_senha);
        return this;
    }
    
    public ProfilePage clickVerIdioma() {
        verIdiomas.click();
        return new ProfilePage(driver);
    }
    
    public ProfilePage clickIdioma() {
        idioma.click();
        return new ProfilePage(driver);
    }
    
    public ProfilePage clickIdioma2() {
        idioma2.click();
        return new ProfilePage(driver);
    }
   
    public ProfilePage clickSave() {
        save.click();
        return new ProfilePage(driver);
    }
    
    public String setMensagem() {
        return mensagem.getText();
    }
     
}
