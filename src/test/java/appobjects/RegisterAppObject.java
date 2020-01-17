package appobjects;

import frameworks.UtilsFw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAppObject {
    private WebDriver driver;

    public RegisterAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMyAccountButton() {
        return driver.findElement(By.cssSelector(".dropdown.dropdown-login.dropdown-tab > #dropdownCurrency"));
    }

    public WebElement getSignUpButton() {
        return driver.findElement(By.cssSelector("a[class='dropdown-item tr']"));
    }

    public WebElement getFirstNameTextField() {
        return driver.findElement(By.name("firstname"));
    }

    public WebElement getLastNameTextField() {
        return driver.findElement(By.name("lastname"));
    }

    public WebElement getMobileNumberTextField() {
        return driver.findElement(By.name("phone"));
    }

    public WebElement getEmailTextField() {
        return driver.findElement(By.name("email"));
    }

    public WebElement getPasswordTextField() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getConfirmPassword() {
        return driver.findElement(By.name("confirmpassword"));
    }

    public WebElement getConfirmSignUpButton() {
        return driver.findElement(By.cssSelector("button[class*='btn-success']"));
    }

    public WebElement getValidarEmailExistLabel() {
        return driver.findElement(By.xpath("//div[@class='resultsignup']/div"));
    }

    public boolean validarEmailExist() {
        try {
            UtilsFw.visibilityOf(driver, this.getValidarEmailExistLabel(), 5);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public WebElement getValidarSuccessLabel() {
        return driver.findElement(By.cssSelector("h3.text-align-left"));
    }

    public WebElement getNameButton() {
        return driver.findElement(By.cssSelector(".dropdown.dropdown-login.dropdown-tab > #dropdownCurrency"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector("li.d-none.d-md-block.fl > div > div > div > a:nth-child(2)"));
    }
}
