package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Usuario
 */
public class AkauntingPage extends BasePage{
  
    @FindBy(tagName = "h1")
    WebElement dashboard;
    
    Menu menu;
    
    public AkauntingPage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);
    }
     
    public Menu getMenu() {
        return menu;
    }
    
    public String getTitle() {
        return dashboard.getText();
    }  
}
