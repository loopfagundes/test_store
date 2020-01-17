package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
    private WebDriver driver;

    public LoginAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMyAccountButton() {
        return driver.findElement(By.cssSelector(".dropdown.dropdown-login.dropdown-tab #dropdownCurrency"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("a.dropdown-item.active.tr"));
    }

    public WebElement getEmailCampoTextField() {
        return driver.findElement(By.name("username"));
    }

    public WebElement getSenhaCampoTextField() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getAcessaLoginButton() {
        return driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.btn-block.loginbtn"));
    }

    public WebElement getValidarLoginLabel() {
        return driver.findElement(By.cssSelector("h3.text-align-left"));
    }

    public WebElement getToursButton() {
        return driver.findElement(By.cssSelector("#mobileMenuMain > nav > ul:nth-child(2) > li:nth-child(1) > a"));
    }
}
