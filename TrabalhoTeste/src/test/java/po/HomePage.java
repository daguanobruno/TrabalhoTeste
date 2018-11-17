package po;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Usuario
 */
public class HomePage extends AkauntingPage{
     public HomePage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.100.61");
    }
}
