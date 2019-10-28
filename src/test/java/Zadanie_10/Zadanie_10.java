package Zadanie_10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.profiler.ProfilerLogEntry;
import org.openqa.selenium.support.ui.Select;

public class Zadanie_10 {

        private WebDriver driver;

        @Before
        public void setUp() {

                System.setProperty("webdriver.chrome.driver",
                        "src/main/resources/WebDrivers/chromedriver");
                // Uruchom nowy egzemplarz przeglądarki Chrome
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                // Przejdź do strony www.
                driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        }
        @Test
        public void testFormularza() {
                WebElement firstName = driver.findElement(By.id("first-name"));
                firstName.clear();
                firstName.sendKeys("Karol");

                WebElement lastName = driver.findElement(By.id("last-name"));
                lastName.clear();
                lastName.sendKeys("KoŁalsky");
// TODO: 27.10.2019 - poprawić działanie wyboru z checkbox w przypadku istnienia np 3ech elemtnów 
//                WebElement gender = driver.findElement(By.name("gender"));
//                gender.clear();
//                gender.sendKeys("Male");

                WebElement dob = driver.findElement(By.id("dob"));
                dob.clear();
                dob.sendKeys("05/22/2010");

                WebElement address = driver.findElement(By.id("address"));
                address.clear();
                address.sendKeys("Prosta 51");

                WebElement email = driver.findElement(By.id("email"));
                email.clear();
                email.sendKeys("karol.kowalski@mailinator.com");

                WebElement password = driver.findElement(By.id("password"));
                password.clear();
                password.sendKeys("Pass123");

                WebElement company = driver.findElement(By.id("company"));
                company.clear();
                company.sendKeys("Coders Lab");

//                Select roleDropdown = new Select(driver.findElement(By.id(ProfilerLogEntry)))

                WebElement manRadioButton = driver.findElement(By.name("gender"));
                if (manRadioButton.isDisplayed()){
                        manRadioButton.click();
                }else {
                        Assert.fail("Pole plec jest niewidoczne");
                }

                WebElement comment = driver.findElement(By.id("comment"));
                comment.clear();
                comment.sendKeys("Mój któryś tam automat testowy");
        }

}


