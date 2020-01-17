
package frameworks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static frameworks.DriverManagerFactoryFw.setDriver;

public class BaseTestFw {

    private static WebDriver driver;

    public WebDriver getDriver() {
        this.driver = setDriver(DriverTypeFw.CHROME);
        return driver;
    }

    @BeforeTest
    public static void setUp() {

    }

    @AfterTest
    public static void tearDown() {
        //quitDriver();
    }
}

