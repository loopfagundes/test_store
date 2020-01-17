package tasks;

import appobjects.ReservaAppObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ReservaTask {
    private WebDriver driver;
    private ReservaAppObject reservaAppObject;

    public ReservaTask(WebDriver driver) {
        this.driver = driver;
        this.reservaAppObject = new ReservaAppObject(driver);
    }

    public void reservarVoo (String date) {
        reservaAppObject.getTourSydneyButton().click();
        reservaAppObject.getCalendarioTextField().clear();
        reservaAppObject.getCalendarioTextField().sendKeys(date);
        reservaAppObject.getCalendarioTextField().sendKeys(Keys.ESCAPE);
        reservaAppObject.getChangeDateButton().click();

    }
}
