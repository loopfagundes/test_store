package testcases;

import frameworks.BaseTestFw;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tasks.LoginTask;
import tasks.RegisterTask;
import tasks.ReservaTask;

public class LojaTestCase extends BaseTestFw {
    private WebDriver driver = getDriver();
    private RegisterTask registerTask = new RegisterTask(driver);
    private LoginTask loginTask = new LoginTask(driver) ;
    private ReservaTask reservaTask = new ReservaTask(driver);

    @Test
    public void test() {
        driver.get("https://www.phptravels.net/index.php"); //link
//        registerTask.criarConta("Luciano",
//                                "Test",
//                                "5199999999",
//                                "test@test.com",
//                                "789456",
//                                "789456");
        loginTask.acessarLogin("test@test.com", "789456");
        reservaTask.reservarVoo("25/07/2020");
    }
}
