package Wyklad_9;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddTpCartTShirt {

    WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/WebDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @Test
    public void AddTpCartTShirt() {

        List<WebElement> articles = driver.findElements(By.xpath("//*[@id=\"content\"/section/div/article"));
        WebElement tshirtArticle = articles.get(0);
        tshirtArticle.click();

        Select sizeDropDown = new Select(driver.findElement(By.id("group_1")));
        sizeDropDown.selectByVisibleText("M");
        driver.findElement(By.xpath(xxxxxx)).click();

        Assert.assertEquals();
    }

    @After
    public void tearDown()  {
//        driver.quit();

    }
}
