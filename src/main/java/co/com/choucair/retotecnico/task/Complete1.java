package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.CompleteFormPage1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Complete1 implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    public Complete1(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public static Complete1 theForm1(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {

        return Tasks.instrumented(Complete1.class, firstName, lastName, email, birthMonth, birthDay, birthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(CompleteFormPage1.INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(CompleteFormPage1.INPUT_LAST_NAME),
                Enter.theValue(email).into(CompleteFormPage1.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(CompleteFormPage1.SELECT_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(CompleteFormPage1.SELECT_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(CompleteFormPage1.SELECT_YEAR),
                Click.on(CompleteFormPage1.NEXT_LOCATION_BUTTON)
                );
    }
}
