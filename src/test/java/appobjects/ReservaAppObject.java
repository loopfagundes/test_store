package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservaAppObject {
    private WebDriver driver;

    public ReservaAppObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getTourSydneyButton() {
        return driver.findElement(By.cssSelector("a[href*='Sydney']"));
    }

    public WebElement getCalendarioTextField() {
        return driver.findElement(By.cssSelector(".content input.form-control.tourdate.form-control-sm"));
    }

    public WebElement getChangeDateButton() {
        return driver.findElement(By.cssSelector("div.content .btn.btn-block.btn-success.btn-sm.loader.mt-5.date"));
    }

}
