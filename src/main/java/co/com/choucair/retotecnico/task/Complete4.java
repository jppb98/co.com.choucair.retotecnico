package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.CompleteFormPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete4 implements Task {

    private String password;
    private String confirmPassword;

    public Complete4(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Performable theForm4(String password, String confirmPassword) {
        return Tasks.instrumented(Complete4.class, password, confirmPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(CompleteFormPage4.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(CompleteFormPage4.INPUT_CONFIRM_PASSWORD),
                Click.on(CompleteFormPage4.ACCEPT_TERMS_CHECK),
                Click.on(CompleteFormPage4.READ_PRIVACY_CHECK),
                Click.on(CompleteFormPage4.COMPLETE_SETUP_BUTTON)
        );
    }
}
