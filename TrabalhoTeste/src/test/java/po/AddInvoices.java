package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class AddInvoices extends BasePage{
    
    @FindBy(xpath = "//*[@id=\"button-customer\"]")
    WebElement addNewCustomer;
    
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement name;
    
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    
    @FindBy(xpath = "//*[@id=\"tax_number\"]")
    WebElement taxNumber;
    
    @FindBy(xpath = "//*[@id=\"select2-currency_code-container\"]")
    WebElement sppinerSelect;
    
    @FindBy(xpath = "//*[@id=\"form-create-customer\"]/div/div[4]/div/span/span[1]/span")
    WebElement usDollar;
    
    @FindBy(xpath = "//*[@id=\"address\"]")
    WebElement address;
    
    @FindBy(xpath = "//*[@id=\"button-create-customer\"]")
    WebElement saveCustomer;
    
    @FindBy(xpath = "//*[@id=\"invoiced_at\"]")
    WebElement invoiceData;
    
    @FindBy(xpath = "/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]")
    WebElement selectDayInvoice;
    
    @FindBy(xpath = "//*[@id=\"due_at\"]")
    WebElement dueData;
    
    @FindBy(xpath = "@FindBy(xpath = \"/html/body/div[2]/div[1]/table/tbody/tr[1]/td[3]\")\n")
    WebElement selectDayDue;
    
    @FindBy(xpath = "//*[@id=\"order_number\"]")
    WebElement orderNumber;
    
    @FindBy(xpath = "//*[@id=\"item-name-0\"]")
    WebElement itemsName;
    
    @FindBy(xpath = "//*[@id=\"item-row-0\"]/td[2]/ul/li/a")
    WebElement item;
    
    @FindBy(xpath = "//*[@id=\"item-quantity-0\"]")
    WebElement quantity;
    
    @FindBy(xpath = "//*[@id=\"item-price-0\"]")
    WebElement prices;
    
    @FindBy(xpath = "//*[@id=\"select2-item-tax-0-container\"]")
    WebElement sppinerTax;
    
    @FindBy(xpath = "//*[@id=\"select2-item-tax-0-container\"]")
    WebElement tax;
    
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/form/div[1]/div[8]")
    WebElement notes;
    
    @FindBy(xpath = "//*[@id=\"select2-category_id-container\"]")
    WebElement sppinerCategory;
    
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/form/div[1]/div[9]/div/span/span[1]/span")
    WebElement deposit;
    
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/button")
    WebElement save;
    
    @FindBy(xpath = "/html/body/div/div/section[2]/div[1]/section/div[4]/div/table/tbody/tr[2]/td[1]/small")
    WebElement verificarSku;
    
    public AddInvoices(WebDriver driver) {
        super(driver);
    }
    
    public AddInvoices clickNewCustomer() {
        addNewCustomer.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices setNome(String nome) {
        name.clear();
        name.sendKeys(nome);
        return this;
    }
    
    public AddInvoices setEmail(String emailp) {
        email.clear();
        email.sendKeys(emailp);
        return this;
    }
    
    public AddInvoices setTaxNumber(String tax) {
        taxNumber.clear();
        taxNumber.sendKeys(tax);
        return this;
    }
    
    /*public AddInvoices clickSppinerSelect() {
        sppinerSelect.click();
        return new AddInvoices(driver);
    }
      
    public AddInvoices clickUsDollar() {
        usDollar.click();
        return new AddInvoices(driver);
    }
    */
    public AddInvoices setAddress(String endereco) {
        address.clear();
        address.sendKeys(endereco);
        return this;
    }
    
    public AddInvoices clickSaveCustomr() {
        saveCustomer.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickInvoiceData() {
        invoiceData.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickDayInvoice() {
        selectDayInvoice.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickDueData() {
        dueData.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickDayDue() {
        selectDayDue.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices setOrderNumber(String number) {
        orderNumber.clear();
        orderNumber.sendKeys(number);
        return this;
    }
    
    public AddInvoices setItemsName(String nome) {
        itemsName.clear();
        itemsName.sendKeys(nome);
        return this;
    }
 
    public AddInvoices clickItem() {
        item.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices setQuantity(String quantidade) {
        quantity.clear();
        quantity.sendKeys(quantidade);
        return this;
    }
    
    /*
    public AddInvoices setPrice(String preco) {
        prices.clear();
        prices.sendKeys(preco);
        return this;
    }*/
    
     public AddInvoices clickSppinerTax() {
        sppinerTax.click();
        return new AddInvoices(driver);
    }
     
    public AddInvoices clickTax() {
        tax.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices setNotes(String notas) {
        notes.clear();
        notes.sendKeys(notas);
        return this;
    }
    
    public AddInvoices clickSppinerCategory() {
        sppinerCategory.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickDeposit() {
        deposit.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickSave() {
        save.click();
        return new AddInvoices(driver);
    }
    
    public String setVerificarSku() {
        return verificarSku.getText();
    }
}
