package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class InvoicesPage extends AkauntingPage{
    
    @FindBy(xpath = "/html/body/div/div/section[1]/h1/span[1]/a")
    WebElement addInvoicesButton;
    
    @FindBy(xpath = "//*[@id=\"tbl-invoices\"]/tbody/tr/td[1]/a")
    WebElement showButton;
   
    
    public InvoicesPage(WebDriver driver) {
        super(driver);
    }
    
    public AddInvoices clickFindButton() {
        addInvoicesButton.click();
        return new AddInvoices(driver);
    }
    
    public AddInvoices clickShowButton() {
        showButton.click();
        return new AddInvoices(driver);
    }
}
