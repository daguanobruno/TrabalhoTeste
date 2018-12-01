package trabalhoTeste;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import po.AddItems;
import po.AddVendors;
import po.AkauntingPage;
import po.CategoriesPage;
import po.InvoicesPage;
import po.ItemsPage;
import po.LoginPage;
import po.Menu;
import po.ProfitLossPage;
import po.TransactionPage;
import po.VendorsPage;

/**
 *
 * @author Usuario
 */
public class SetimoCaseTest {

    private WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void before() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("lang=en-US");
        chromeOptions.addArguments("start-maximized");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void SelecionarDespesas() {

        LoginPage login = new LoginPage(driver);

        login.setEmail("teste@teste.com").
                setSenha("utfpr").
                Logar();

        TransactionPage transaction = login.getMenu().goToBanking().goToTransaction();
        transaction.clickExpense().clickFilter();

        String mensagem = "";

        try {
            mensagem = transaction.setMessage();
            assertEquals(mensagem, "Transfer");
        } catch (Exception e) {
            mensagem = "Nenhuma Transferência realizada";
            System.err.println(mensagem);
        }
    }

}
