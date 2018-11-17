package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class VendorsPage extends AkauntingPage{
    
    @FindBy(xpath = "/html/body/div/div/section[1]/h1/span[1]/a")
    WebElement addVendorsButton;
    
    public VendorsPage(WebDriver driver) {
        super(driver);
    }
    
    public AddVendors clickFindButton() {
        addVendorsButton.click();
        return new AddVendors(driver);
    }
}
