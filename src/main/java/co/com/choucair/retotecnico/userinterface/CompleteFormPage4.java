package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormPage4 {

    public static final Target INPUT_PASSWORD = Target.the("Write your password here")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirm your password here")
            .located(By.id("confirmPassword"));

    public static final Target ACCEPT_TERMS_CHECK = Target.the("Click on the accept UTest terms check")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target READ_PRIVACY_CHECK = Target.the("Click on the privacy and policy check")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Click on the complete setup button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}
