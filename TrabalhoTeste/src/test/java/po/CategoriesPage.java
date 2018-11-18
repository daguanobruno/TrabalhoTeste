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
public class CategoriesPage extends AkauntingPage{
    
    @FindBy(xpath = "//*[@id=\"tbl-categories\"]/tbody/tr[2]/td[1]/a")
    WebElement general;
    
    @FindBy(xpath = "//*[@id=\"color\"]")
    WebElement colour;
    
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/button")
    WebElement save;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div[1]")
    WebElement message;
            
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }
    
    public CategoriesPage clickGeneral() {
        general.click();
        return new CategoriesPage(driver);
    }
    
    public CategoriesPage setColour(String cor) {
        colour.clear();
        colour.sendKeys(cor);
        return this;
    }
    
    public CategoriesPage clickSave() {
        save.click();
        return new CategoriesPage(driver);
    }
    
     public String setMessage() {
        return message.getText();
    }
}
