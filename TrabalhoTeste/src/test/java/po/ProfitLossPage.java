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
public class ProfitLossPage extends AkauntingPage{
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[1]/form/div/select")
    WebElement ano;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[1]/form/div/select/option[9]")
    WebElement selectAno;
            
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[2]/div/table[4]/tbody/tr/th[6]/span")
    WebElement netProfit;
    
    public ProfitLossPage(WebDriver driver) {
        super(driver);
    }
    
    public ProfitLossPage clickAno() {
        ano.click();
        return new ProfitLossPage(driver);
    }
    
    public ProfitLossPage clickSelecionarAno() {
        selectAno.click();
        return new ProfitLossPage(driver);
    }
    
    public String setLucro() {
        return netProfit.getText();
    }
    
}
