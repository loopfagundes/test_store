package frameworks;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ScreenshotFw {

    private static final String PATH_SCREENSHOT = System.getProperty("user.dir") + File.separator + "reports"
            + File.separator + "screenshots";

    public static MediaEntityModelProvider takeViewpointShot(WebDriver driver, String nomeMetodo) {
        try {

            File srcShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String path = PATH_SCREENSHOT + File.separator + srcShot.getName();

            FileUtils.copyFile(srcShot, new File(path));

            return MediaEntityBuilder.createScreenCaptureFromPath(path).build();

        } catch (IOException ex) {
            System.out.println("Não foi possivel gerar imagem!");
        }

        return null;
    }

    public static void takeFullPageShot(WebDriver driver, String nomeMetodo) {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(driver);

        String path = "target" + File.separator + "screenshot" + File.separator + nomeMetodo
                + DateTimeFormatterFw.getTime() + ".jpg";

        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File(path));

        } catch (IOException e) {
            System.out.println("Não foi posssível capturar a tela");
            e.printStackTrace();
        }
    }

    public static MediaEntityModelProvider capture(WebDriver driver) {
        try {
            return MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64)).build();
        } catch(Exception ex) {}
        return null;
    }
}
