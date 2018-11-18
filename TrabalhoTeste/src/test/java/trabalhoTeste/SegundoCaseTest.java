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
import po.HomePage;
import po.ItemsPage;
import po.Login;
import po.Menu;
import po.VendorsPage;

/**
 *
 * @author Usuario
 */
public class SegundoCaseTest {

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
    public void ItemCadastradoComSucesso() {
        HomePage homePage = new HomePage(driver);
        Login login = new Login(driver);

        login.setEmail("teste@teste.com").
                setSenha("utfpr").
                Logar();

        ItemsPage items = homePage.getMenu().goToItems();

        AddItems addItems = items.clickFindButton();

        addItems.setNome("Moto G5s Plus").
                setSKU("5").
                setDescricao("Smartphone\n Motorola Moto G5s Plus 32GB - Platinum Dual Chip\n"
                        + "4G Câm. Duo 13MP + 13MP").
                setSalePrice("1349").
                setPurchasePrice("1200").
                setQuantidade("50").
                clickSpinnerTax().
                clickTaxButton().
                clickSpinnerCategory().
                clickGeneral().
                clickEnabled().
                clickSave();

        String mensagem = addItems.setMessage();

        assertEquals("Item added!", mensagem);

    }

    //@Test
    public void ErroNoCadastro() {

        HomePage homePage = new HomePage(driver);
        Login login = new Login(driver);

        login.setEmail("teste@teste.com").
                setSenha("utfpr").
                Logar();

        ItemsPage items = homePage.getMenu().goToItems();

        AddItems addItems = items.clickFindButton();

        addItems.setNome("Moto G5s Plus").
                setSKU("1").
                setDescricao("Smartphone\n Motorola Moto G5s Plus 32GB - Platinum Dual Chip\n"
                        + "4G Câm. Duo 13MP + 13MP").
                setSalePrice("1349").
                setPurchasePrice("1200").
                setQuantidade("50").
                clickSpinnerTax().
                clickTaxButton().
                clickSpinnerCategory().
                clickGeneral().
                clickEnabled().
                clickSave();

        String mensagem = addItems.setErrorMessage();

        assertEquals("The sku has already been taken.", mensagem);
    }

}
