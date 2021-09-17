package co.com.choucair.retotecnico.task;

import co.com.choucair.retotecnico.userinterface.CompleteFormPage3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete3 implements Task {

    private String mobileDevice;
    private String model;
    private String operatingSystem;

    public Complete3(String mobileDevice, String model, String operatingSystem) {
        this.mobileDevice = mobileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public static Performable theForm3(String mobileDevice, String model, String operatingSystem) {
        return Tasks.instrumented(Complete3.class, mobileDevice, model, operatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CompleteFormPage3.ARROW_SHOW_DEVICE_OPTIONS),
                Enter.theValue(mobileDevice).into(CompleteFormPage3.INPUT_MOBILE_DEVICE),
                Click.on(CompleteFormPage3.SELECT_MOBILE_DEVICE),
                Click.on(CompleteFormPage3.ARROW_SHOW_MODEL_OPTIONS),
                Enter.theValue(model).into(CompleteFormPage3.INPUT_MODEL),
                Click.on(CompleteFormPage3.SELECT_MODEL),
                Click.on(CompleteFormPage3.ARROW_SHOW_OPERATING_SYSTEM),
                Enter.theValue(operatingSystem).into(CompleteFormPage3.INPUT_OPERATING_SYSTEM),
                Click.on(CompleteFormPage3.SELECT_OPERATING_SYSTEM),
                Click.on(CompleteFormPage3.LAST_STEP_BUTTON)
        );
    }
}
