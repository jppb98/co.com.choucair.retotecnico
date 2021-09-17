package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormPage2 {

    public static final Target INPUT_ZIP_CODE = Target.the("Write the zip code")
            .located(By.id("zip"));

    public static final Target NEXT_DEVICE_BUTTON = Target.the("Click on the next device button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
