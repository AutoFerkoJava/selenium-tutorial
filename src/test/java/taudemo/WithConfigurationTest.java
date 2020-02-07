package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithConfigurationTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justATest() {
        driver.get("https://www.example.com");
        assertEquals("Example Domain", driver.getTitle());
    }
}

//1.In this test, similarly to what I had in the SeleniumTest, I will need a BrowserGetter instance and a WebDriver because
// I will also open the browser here.
//2.So, I will say: private BrowserGetter browserGetter = new BrowserGetter().
//3.And then I'm just going to create the private WebDriver driver field.
//4.I will create a BeforeAll method — public void beforeAll.
//5.I'm not going to call the getChromeDriver method, but instead I'm going to call a method which is called getDriver.

