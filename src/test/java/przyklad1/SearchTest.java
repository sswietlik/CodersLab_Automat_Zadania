package przyklad1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class SearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/WebDrivers/chromedriver");
                                                                        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

                                                                        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
                                                                        // Przejdź do Google
        driver.get("http://www.google.com");
    }
    @Test
    public void testGoogleSearch() {
                                                                        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
                                                                        // Wyczyść teskst zapisany w elemencie
        element.clear();

                                                                        // Wpisz informacje do wyszukania
        element.sendKeys("Testowanie Selenium WebDriver");
                                                                        //        Można także symulować naciskanie klawiszy, które nie reprezentują tekstu. W tym celu do metody
                                                                        //        sendKeys() przekazujemy dodatkowo wartości typu Keys .
                                                                        //                np. element.sendKeys ("Karol" + Keys.TAB);
                                                                        //        Lista dostępnych klawiszy znajduję się pod linkiem
                                                                        //        https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/Keys.html

                                                                        // Prześlij formularz
        element.submit();
    }
    @After
    public void tearDown() throws Exception {
                                                                        // Zamknij przeglądarkę
        driver.quit();
    }
}