package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {

    public static final Target WELCOME_MESSAGE = Target.the("Show the welcome message when you finish the Form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));

}
