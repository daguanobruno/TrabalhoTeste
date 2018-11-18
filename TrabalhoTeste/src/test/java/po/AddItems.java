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
public class AddItems extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement name;
    
    @FindBy(xpath = "//*[@id=\"sku\"]")
    WebElement sku;
    
    @FindBy(xpath = "//*[@id=\"description\"]")
    WebElement description;
    
    @FindBy(xpath = "//*[@id=\"sale_price\"]")
    WebElement salePrice;
    
    @FindBy(xpath = "//*[@id=\"purchase_price\"]")
    WebElement purchasePrice;
    
    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement quantity;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[7]/div/span/span[1]/span/span[2]")
    WebElement spinnerTax;
    
    @FindBy(xpath = "//*[@id=\"tax_id\"]/option[2]")
    WebElement taxButton;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[8]/div/span/span[1]/span/span[2]")
    WebElement spinnerCategory;
    
    @FindBy(xpath = "//*[@id=\"select2-category_id-results\"]")
    WebElement general;
    
    @FindBy(xpath = "//*[@id=\"enabled_1\"]")
    WebElement enabled;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[2]/div/div/button")
    WebElement save;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div[1]")
    WebElement message;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[2]/p")
    WebElement errorMessage;
    
    public AddItems(WebDriver driver) {
        super(driver);
    }
    
     public AddItems setNome(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }
     
    public AddItems setSKU(String skup) {
        sku.clear();
        sku.sendKeys(skup);
        return this;
    }
    
    public AddItems setDescricao(String descricao) {
        description.clear();
        description.sendKeys(descricao);
        return this;
    }
    
    public AddItems setSalePrice(String salPrice) {
        salePrice.clear();
        salePrice.sendKeys(salPrice);
        return this;
    }
    
    public AddItems setPurchasePrice(String purchasePricep) {
        purchasePrice.clear();
        purchasePrice.sendKeys(purchasePricep);
        return this;
    }
    
    public AddItems setQuantidade(String quantidade) {
        quantity.clear();
        quantity.sendKeys(quantidade);
        return this;
    }
    
    public AddItems clickSpinnerTax() {
        spinnerTax.click();
        return new AddItems(driver);
    }
    
    public AddItems clickTaxButton() {
        taxButton.click();
        return new AddItems(driver);
    }
    
    public AddItems clickSpinnerCategory() {
        spinnerCategory.click();
        return new AddItems(driver);
    }
    
    public AddItems clickGeneral() {
        general.click();
        return new AddItems(driver);
    }
    
    public AddItems clickEnabled() {
        enabled.click();
        return new AddItems(driver);
    }
    
    public AddItems clickSave() {
        save.click();
        return new AddItems(driver);
    }
    
    public String setMessage() {
        return message.getText();
    }
    
    public String setErrorMessage() {
        return errorMessage.getText();
    }
    
}
