package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

//comment

/**
 * Javadoc
 */

//todo
@TestInstance(PER_CLASS)
public class SeleniumTest {
    @SuppressWarnings("CanBeFinal")
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }
    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }
}
// 1.Now that we have a test class, we can start creating the actual tests. These will be stored as methods.
// 2.The purpose of the test that I'm currently creating is to open a browser, open a page in the browser,
// then interact with that page, and after the test has run, I want to close the browser.
// 3. For that I will use a method annotated with the @BeforeAll annotation, which will execute before any other test method will execute.
// In this method I want to put the code which opens my browser.
// 4. After all the tests have been run, I want to also close the browser. So, for this purpose, I will create a method annotated with @AfterAll.
// This annotation, also from JUnit, specifies that the method, which is annotated with this annotation,
// will run after all of the test methods from this class have run.
