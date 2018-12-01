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
    
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[2]/a")
    WebElement items;
    
    @FindBy(xpath = "/html/body/div/header/a/span[2]/b")
    WebElement akuaunting;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[3]/a")
    WebElement incomes;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[3]/ul/li[1]/a/span")
    WebElement invoices;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[3]/ul/li[3]/a")
    WebElement customers;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[4]/a/span[1]")
    WebElement expenses;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[5]/a/span[1]")
    WebElement banking;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[5]/ul/li[3]/a/span")
    WebElement transaction;
    
    @FindBy(xpath = "/html/body/div[1]/aside/div/section/ul[2]/li[4]/ul/li[3]/a")
    WebElement vendors;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[6]/a/span[1]")
    WebElement reports;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[6]/ul/li[5]/a/span")
    WebElement profitLoss;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[7]/a/span[1]")
    WebElement settings;
    
    @FindBy(xpath = "/html/body/div/aside/div/section/ul[2]/li[7]/ul/li[2]/a/span")
    WebElement categories;
    
    @FindBy(xpath = "/html/body/div[1]/header/nav/div/ul/li[5]/a")
    WebElement profile;
    
    @FindBy(xpath = "/html/body/div/header/nav/div/ul/li[5]/ul/li[3]/div[1]/a")
    WebElement profileButton;
    
    public Menu(WebDriver driver) {
        super(driver);
    }
    
    public Menu goToIncomes() {
        clickMenuOption(incomes);
        return new Menu(driver);
    }
    
     public ItemsPage goToItems() {
        clickMenuOption(items);
        return new ItemsPage(driver);
    }
     
    public InvoicesPage goToInvoices() {
        clickMenuOption(invoices);
        return new InvoicesPage(driver);
    }
    
    public VendorsPage goToVendors() {
        clickMenuOption(vendors);
        return new VendorsPage(driver);
    }
    
    public Menu goToBanking() {
        clickMenuOption(banking);
        return new Menu(driver);
    }
    
    public TransactionPage goToTransaction() {
        clickMenuOption(transaction);
        return new TransactionPage(driver);
    }
    
    public Menu goToExpenses() {
        clickMenuOption(expenses);
        return new Menu(driver);
    }
    
    public CostumersPage goToCustomers() {
        clickMenuOption(customers);
        return new CostumersPage(driver);
    }
    
    public Menu goToReports() {
        clickMenuOption(reports);
        return new Menu(driver);
    }
    
    public ProfitLossPage goToProfitLoss() {
        clickMenuOption(profitLoss);
        return new ProfitLossPage(driver);
    }
    
    public Menu goToSettings() {
        clickMenuOption(settings);
        return new Menu(driver);
    }  

    public CategoriesPage goToCategories() {
        clickMenuOption(categories);
        return new CategoriesPage(driver);
    }  
    
    public Menu goToProfile() {
        clickMenuOption(profile);
        return new Menu(driver);
    }  
    
    public ProfilePage goToProfileButtom() {
        clickMenuOption(profileButton);
        return new ProfilePage(driver);
    }  
    
    public LoginPage goToLoginHome() {
        clickMenuOption(akuaunting);
        return new LoginPage(driver);
    }    
    
    private void clickMenuOption(WebElement menuOption) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until( ExpectedConditions.elementToBeClickable(menuOption) );
        menuOption.click();
    }
}
