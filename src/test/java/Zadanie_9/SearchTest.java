package Zadanie_9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.get("http://www.bing.com");
    }
    @Test
    public void testGoogleSearch() {
                                                                        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
                                                                        // Wyczyść teskst zapisany w elemencie
        element.clear();

                                                                        // Wpisz informacje do wyszukania
        element.sendKeys("Mistrzostwa Świata w piłce noż");
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