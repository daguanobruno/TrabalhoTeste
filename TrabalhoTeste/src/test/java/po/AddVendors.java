package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class AddVendors extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement nome;
    
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    
    @FindBy(xpath = "//*[@id=\"tax_number\"]")
    WebElement tax_number;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[4]/div/span/span[1]/span/span[2]")
    WebElement currency;
    
    @FindBy(xpath = "//*[@id=\"select2-currency_code-container\"]")
    WebElement usDollar;
    
    @FindBy(xpath = "//*[@id=\"website\"]")
    WebElement website;
    
    @FindBy(xpath = "//*[@id=\"phone\"]")
    WebElement phone;
    
    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement address;
    
    @FindBy(xpath = "//*[@id=\"enabled_1\"]")
    WebElement enabled;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[2]/div/div/button")
    WebElement save;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div[1]")
    WebElement message;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div/form/div[1]/div[2]/p")
    WebElement errorMessage;
    
    public AddVendors(WebDriver driver) {
        super(driver);
    }
    
    public AddVendors setNome(String name) {
        nome.clear();
        nome.sendKeys(name);
        return this;
    }
    
    public AddVendors setEmail(String emailp) {
        email.clear();
        email.sendKeys(emailp);
        return this;
    }
    
    public AddVendors setTax_Number(String tax) {
        tax_number.clear();
        tax_number.sendKeys(tax);
        return this;
    }
    
    public AddVendors clickCurrenctButton() {
        currency.click();
        return new AddVendors(driver);
    }
    
    public AddVendors clickUsDollarButton() {
        usDollar.click();
        return new AddVendors(driver);
    }
    
    public AddVendors setWebSite(String site) {
        website.clear();
        website.sendKeys(site);
        return this;
    }
    
    public AddVendors setPhone(String telefone) {
        phone.clear();
        phone.sendKeys(telefone);
        return this;
    }
    
    public AddVendors setAddress(String addressp) {
        address.clear();
        address.sendKeys(addressp);
        return this;
    }
    
    public AddVendors clickEnabledButton() {
        enabled.click();
        return new AddVendors(driver);
    }
    
    public AddVendors clickSaveButton() {
        save.click();
        return new AddVendors(driver);
    }
    
    public String setMessage() {
        return message.getText();
    }
    
    public String setErrorMessage() {
        return errorMessage.getText();
    }
}
