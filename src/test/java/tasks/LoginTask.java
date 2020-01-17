package tasks;

import appobjects.LoginAppObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTask {
    private WebDriver driver;
    private LoginAppObject loginAppObject;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.loginAppObject = new LoginAppObject(driver);
    }

    public void acessarLogin(String email, String senha) {
        loginAppObject.getMyAccountButton().click();
        loginAppObject.getLoginButton().click();
        loginAppObject.getEmailCampoTextField().sendKeys(email);
        loginAppObject.getSenhaCampoTextField().sendKeys(senha);
        loginAppObject.getAcessaLoginButton().click();

        String exp = "Hi, Luciano Test";
        String actual = loginAppObject.getValidarLoginLabel().getText();
        Assert.assertEquals(exp, actual);

        loginAppObject.getToursButton().click();
    }
}
