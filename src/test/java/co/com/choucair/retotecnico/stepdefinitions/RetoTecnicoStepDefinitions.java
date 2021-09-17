package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.RetoTecnicoData;
import co.com.choucair.retotecnico.question.Answer;
import co.com.choucair.retotecnico.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to create a new user in Utest page$")
    public void thanJuanWantsToCreateANewUserInUtestPage() {
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(), (Join.toThePage()));
    }

    @When("^he enters to the UTest page and complete the form$")
    public void heEntersToTheUTestPageAndClickOnJoinToday(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Complete1.theForm1(retoTecnicoData.get(0).getFirstName(), retoTecnicoData.get(0).getLastName(),
                retoTecnicoData.get(0).getEmail(), retoTecnicoData.get(0).getBirthMonth(), retoTecnicoData.get(0).getBirthDay(),
                retoTecnicoData.get(0).getBirthYear()), Complete2.theForm2(retoTecnicoData.get(0).getZipCode()),
                Complete3.theForm3(retoTecnicoData.get(0).getMobileDevice(), retoTecnicoData.get(0).getModel(),
                retoTecnicoData.get(0).getOperatingSystem()), Complete4.theForm4(retoTecnicoData.get(0).getPassword(),
                retoTecnicoData.get(0).getConfirmPassword()));
    }

    @Then("^he creates the new user$")
    public void heCreatesTheNewUser(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoTecnicoData.get(0).getWelcomeMessage())));
    }

}
