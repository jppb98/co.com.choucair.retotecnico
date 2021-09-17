package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.CompleteFormPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete2 implements Task {

    private String zipCode;

    public Complete2( String zipCode) {
        this.zipCode = zipCode;
    }

    public static Performable theForm2(String zipCode) {
        return Tasks.instrumented(Complete2.class, zipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(zipCode).into(CompleteFormPage2.INPUT_ZIP_CODE),
                Click.on(CompleteFormPage2.NEXT_DEVICE_BUTTON)
        );

    }
}
