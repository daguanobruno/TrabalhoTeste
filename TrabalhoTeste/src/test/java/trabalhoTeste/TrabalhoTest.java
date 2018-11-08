package trabalhoTeste;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrabalhoTest {

    //@Test
    public void teste01() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://192.168.100.61/auth/login");

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
        login.sendKeys("teste@teste.com");

        WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
        password.sendKeys("utfpr");

        WebElement logar = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/button"));
        logar.click();

        WebElement expenses = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[4]/a"));
        expenses.click();

        WebElement vendors = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[4]/ul/li[3]/a"));
        vendors.click();

        WebElement addVendors = driver.findElement(By.xpath("/html/body/div/div/section[1]/h1/span[1]/a"));
        addVendors.click();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Bruno");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("bruno_daguano@hotmail.com");

        WebElement tax_Number = driver.findElement(By.xpath("//*[@id=\"tax_number\"]"));
        tax_Number.sendKeys("1");

        WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        phone.sendKeys("1234567890");

        WebElement webSite = driver.findElement(By.xpath("//*[@id=\"website\"]"));
        webSite.sendKeys("www.daguano.com");

        WebElement address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        address.sendKeys("Teste de Software");

        WebElement save = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/button"));
        save.click();
    }

    //@Test
    public void teste02() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://192.168.100.61/auth/login");

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
        login.sendKeys("teste@teste.com");

        WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
        password.sendKeys("utfpr");

        WebElement logar = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/button"));
        logar.click();

        WebElement items = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[2]"));
        items.click();

        WebElement addItems = driver.findElement(By.xpath("/html/body/div/div/section[1]/h1/span[1]/a"));
        addItems.click();

        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Moto G5s Plus");

        WebElement sku = driver.findElement(By.xpath("//*[@id=\"sku\"]"));
        sku.sendKeys("1");

        WebElement description = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys("Description” com “Smartphone Motorola Moto G5s Plus 32GB - Platinum Dual Chip 4G Câm. Duo 13MP + 13MP");

        WebElement salePrice = driver.findElement(By.xpath("//*[@id=\"sale_price\"]"));
        salePrice.sendKeys("1349");

        WebElement purchasePrice = driver.findElement(By.xpath("//*[@id=\"purchase_price\"]"));
        purchasePrice.sendKeys("1200");

        WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
        quantity.sendKeys("50");

        WebElement tax = driver.findElement(By.xpath("//*[@id=\"select2-tax_id-container\"]"));

        WebElement category = driver.findElement(By.xpath("//*[@id=\"select2-category_id-container\"]"));

        WebElement save = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/form/div[2]/div/div/button"));
        save.click();
    }

    //@Test
    public void teste05() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://192.168.100.61/auth/login");

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
        login.sendKeys("teste@teste.com");

        WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
        password.sendKeys("utfpr");

        WebElement logar = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/button"));
        logar.click();
        
        WebElement settings = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[7]/a/span[1]"));
        settings.click();
        
        WebElement category = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[7]/ul/li[2]/a/span"));
        category.click();
        
        WebElement general = driver.findElement(By.xpath("//*[@id=\"tbl-categories\"]/tbody/tr[2]/td[1]/a"));
        general.click();
        
        WebElement color = driver.findElement(By.xpath("//*[@id=\"color\"]"));
        color.clear();
        color.sendKeys("#0b0c0d");
        
        WebElement save = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/form/div[2]/div/div/button"));
        save.click();
    }

    //@Test
    public void teste07() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://192.168.100.61/auth/login");

        WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
        login.sendKeys("teste@teste.com");

        WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
        password.sendKeys("utfpr");

        WebElement logar = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[2]/button"));
        logar.click();

        WebElement banking = driver.findElement(By.xpath("/html/body/div/aside/div/section/ul[2]/li[5]/a/span[1]"));
        banking.click();

        WebElement transactions = driver.findElement(By.xpath("/html/body/div[1]/aside/div/section/ul[2]/li[5]/ul/li[3]/a/span"));
        transactions.click();

        WebElement expence = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[1]/form/div[1]/select[2]"));
        expence.click();

        WebElement filter = driver.findElement(By.xpath("/html/body/div/div/section[2]/div/div[1]/form/div[1]/button"));
        filter.click();
    }
}
