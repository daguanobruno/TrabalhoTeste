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
public class TransactionPage extends AkauntingPage{
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[1]/form/div[1]/select[2]/option[2]")
    WebElement expense;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/div[1]/form/div[1]/button")
    WebElement filter;
    
    @FindBy(xpath = "//*[@id=\"tbl-transactions\"]/tbody/tr[1]/td[4]")
    WebElement message;
    
    public TransactionPage(WebDriver driver) {
        super(driver);
    }
    
    public TransactionPage clickExpense() {
        expense.click();
        return new TransactionPage(driver);
    }
    
    public TransactionPage clickFilter() {
        filter.click();
        return new TransactionPage(driver);
    }
    
    public String setMessage() {
        return message.getText();
    }
}
