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
import po.AddVendors;
import po.AkauntingPage;
import po.HomePage;
import po.Login;
import po.Menu;
import po.VendorsPage;

/**
 *
 * @author Usuario
 */
public class PrimeiroCaseTest {

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
    public void CadastroComSucesso() {
        HomePage homePage = new HomePage(driver);
        Login login = new Login(driver);

        login.setEmail("teste@teste.com").
                setSenha("utfpr").
                Logar();

        VendorsPage vendors = homePage.getMenu().goToExpenses().goToVendors();

        AddVendors addVendors = vendors.clickFindButton();
        addVendors.setNome("Bruno").
                setEmail("bruno_daguano@hotmail.com").
                setTax_Number("1").
                clickCurrenctButton().
                clickUsDollarButton().
                setPhone("1234567890").
                setWebSite("www.daguano.com").
                setAddress("").
                clickEnabledButton().
                clickSaveButton();

        String mensagem = addVendors.setMessage();

        assertEquals("Vendor added!", mensagem);
    }

    @Test
    public void EmailCadastrado() {

        HomePage homePage = new HomePage(driver);
        Login login = new Login(driver);

        login.setEmail("teste@teste.com").
                setSenha("utfpr").
                Logar();

        VendorsPage vendors = homePage.getMenu().goToExpenses().goToVendors();

        AddVendors addVendors = vendors.clickFindButton();
        addVendors.setNome("Bruno").
                setEmail("bruno_daguano%hotmail.com").
                setTax_Number("2").
                clickCurrenctButton().
                clickUsDollarButton().
                setPhone("1234567890").
                setWebSite("www.daguano.com").
                setAddress("").
                clickEnabledButton().
                clickSaveButton();

        String mensagem = addVendors.setErrorMessage();

        assertEquals("The email must be a valid email address.", mensagem);
    }

}
