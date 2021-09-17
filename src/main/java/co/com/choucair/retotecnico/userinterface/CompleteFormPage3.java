package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormPage3 {

    public static final Target ARROW_SHOW_DEVICE_OPTIONS = Target.the("Click on the arrow to show mobile device options")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/i"));

    public static final Target INPUT_MOBILE_DEVICE = Target.the("Write the mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("Click on the device option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target ARROW_SHOW_MODEL_OPTIONS = Target.the("Click on the arrow to show model options")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/i"));

    public static final Target INPUT_MODEL = Target.the("Write the model device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("Click on the model option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[4]/span/div/span"));

    public static final Target ARROW_SHOW_OPERATING_SYSTEM = Target.the("Click on the arrow to show operating system options")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span/i"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Write the operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Click on the operating system option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target LAST_STEP_BUTTON = Target.the("Click on the last step button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}