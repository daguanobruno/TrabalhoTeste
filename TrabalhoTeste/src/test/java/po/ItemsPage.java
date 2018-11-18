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
public class ItemsPage extends AkauntingPage{
    
    @FindBy(xpath = "/html/body/div/div/section[1]/h1/span[1]/a\n")
    WebElement addItemsButton;
    
    public ItemsPage(WebDriver driver) {
        super(driver);
    }
    
     public AddItems clickFindButton() {
        addItemsButton.click();
        return new AddItems(driver);
    }
    
}
