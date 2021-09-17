package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.RetoTecnicoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private RetoTecnicoPage retoTecnicoPage;

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(retoTecnicoPage));
    }
}
