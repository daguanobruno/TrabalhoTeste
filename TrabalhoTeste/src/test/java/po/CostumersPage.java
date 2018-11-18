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
public class CostumersPage extends AkauntingPage{
    
    @FindBy(xpath = "//*[@id=\"tbl-customers\"]/tbody/tr/td[1]/a")
    WebElement bruno;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[2]/div[1]/div[3]/div/div/span[2]")
    WebElement fatura;
    
    public CostumersPage(WebDriver driver) {
        super(driver);
    }
    
    public CostumersPage clickFilter() {
        bruno.click();
        return new CostumersPage(driver);
    }
    
    public String setVerificarFatura() {
        return fatura.getText();
    }
    
}
