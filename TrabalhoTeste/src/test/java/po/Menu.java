package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Usuario
 */
public class Menu extends BasePage{
    
    @FindBy(xpath = "/html/body/div/header/a/span[2]/b")
    WebElement akuaunting;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[3]/a")
    WebElement incomes;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[3]/ul/li[3]/a")
    WebElement customers;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[4]/a/span[1]")
    WebElement expenses;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[4]/ul/li[3]/a")
    WebElement vendors;
    
    public Menu(WebDriver driver) {
        super(driver);
    }
    
    public Menu goToIncomes() {
        clickMenuOption(incomes);
        return new Menu(driver);
    }
    
     public VendorsPage goToVendors() {
        clickMenuOption(vendors);
        return new VendorsPage(driver);
    }
    
    public Menu goToExpenses() {
        clickMenuOption(expenses);
        return new Menu(driver);
    }
    
    public Menu goToCustomers() {
        clickMenuOption(customers);
        return new Menu(driver);
    }
    
    public HomePage goToHome() {
        clickMenuOption(akuaunting);
        return new HomePage(driver);
    }    
    
    private void clickMenuOption(WebElement menuOption) {
       
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.elementToBeClickable(menuOption) );
        menuOption.click();
    }
}
