package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteFormPage1 {

    public static final Target INPUT_FIRST_NAME = Target.the("Write your first name here")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Write your last name here")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Write your email address here")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("Select the month of birth")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("Select the day of birth")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("Select the year of birth")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Click on the next location button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

}
