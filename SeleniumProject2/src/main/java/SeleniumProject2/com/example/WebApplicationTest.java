package SeleniumProject2.com.example;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebApplicationTest {
    private WebDriver driver;
    private String baseUrl = "http://the-internet.herokuapp.com/";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void verifyHomePageTitle() {
        driver.get(baseUrl);
        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 2)
    public void verifyCheckboxesPage() {
        driver.findElement(By.linkText("Checkboxes")).click();
        String expectedText = "Checkboxes";
        String actualText = driver.findElement(By.tagName("h3")).getText();
        Assert.assertEquals(actualText, expectedText);

        // Check if checkbox 1 is not checked
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        Assert.assertFalse(checkbox1.isSelected());

        // Check if checkbox 2 is checked
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        Assert.assertTrue(checkbox2.isSelected());
    }
    
    // Add more test methods for other steps

    // @AfterTest method to close the browser and perform cleanup
}
