package tasks;

import appobjects.RegisterAppObject;
import frameworks.UtilsFw;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterTask {
    private WebDriver driver;
    private RegisterAppObject registerAppObject;
    public RegisterTask (WebDriver driver) {
        this.driver = driver;
        this.registerAppObject = new RegisterAppObject(driver);
    }

    public  void criarConta(String firstname,
                            String lastname,
                            String phone,
                            String email,
                            String password,
                            String confirmpassword) {
        registerAppObject.getMyAccountButton().click();
        registerAppObject.getSignUpButton().click();
        registerAppObject.getFirstNameTextField().sendKeys(firstname);
        registerAppObject.getLastNameTextField().sendKeys(lastname);
        registerAppObject.getMobileNumberTextField().sendKeys(phone);
        registerAppObject.getEmailTextField().sendKeys(email);
        registerAppObject.getPasswordTextField().sendKeys(password);
        registerAppObject.getConfirmPassword().sendKeys(confirmpassword);
        registerAppObject.getConfirmSignUpButton().click();

        if(registerAppObject.validarEmailExist()) {
            Assert.fail("E-mail utilizado parece já estar cadastrado!");
        }

        Assert.assertEquals(registerAppObject.getValidarSuccessLabel().getText(),  "Hi, Luciano Test");

        UtilsFw.visibilityOf(driver, registerAppObject.getNameButton());
        registerAppObject.getNameButton().click();

        registerAppObject.getLogoutButton().click();
    }
}