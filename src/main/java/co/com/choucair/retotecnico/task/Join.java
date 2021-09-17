package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task {

    public Join() {
    }

    public static Join toThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON));
    }
}
