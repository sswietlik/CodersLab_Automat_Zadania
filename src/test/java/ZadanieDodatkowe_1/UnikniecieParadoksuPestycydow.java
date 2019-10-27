package ZadanieDodatkowe_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class UnikniecieParadoksuPestycydow   {

    private WebDriver driver;
    private Random random;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/WebDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");

        random = new Random();
    }

    @Test
    public void testGoogleSearch() {

        String[] products = {"Mug","t-shirt","notebook"};

        int randomInteger = random.nextInt(products.length);  // products.length - nie trzeba podawać przedziału czyli 0-3 bo program sam się orientuje ile ma elementów biorących udział w losowaniu
        String productsToSearch = products[randomInteger];

        WebElement element = driver.findElement(By.name("s"));
        element.clear();
        element.sendKeys(productsToSearch);
        element.clear();
        element.sendKeys(productsToSearch);
        element.clear();
        element.sendKeys(productsToSearch);
        element.submit();
            System.out.println(random);
    }
//public void print

    @After

public void tearDown() throws Exception {
        // zamyka przeglądarke
   driver.quit();
    }


}