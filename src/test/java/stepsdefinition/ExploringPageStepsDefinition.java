package stepsdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.MessageOf;
import tasks.Fillout;
import tasks.ScrollToTeam;
import userinterface.TeamInternationalPageUserInterface;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExploringPageStepsDefinition {

    @Managed(driver="chrome")
    private WebDriver chromeBrowser;
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user").can(BrowseTheWeb.with(chromeBrowser));
    }
    @Given("User go through the page")
    public void user_go_through_the_page() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new TeamInternationalPageUserInterface()));
    }
    @When("User scroll all page, section by section")
    public void user_scroll_all_page_section_by_section() {
        theActorInTheSpotlight().attemptsTo(ScrollToTeam.page(chromeBrowser));
    }
    @When("Fill out required information on Contact Sales section")
    public void fill_out_required_information_on_contact_sales_section() {
        theActorInTheSpotlight().attemptsTo(Fillout.requiredInformation(chromeBrowser));
    }
    @Then("^User send the information to Contact Sales$")
    public void userSendTheInformationToContactSales() {
        theActorInTheSpotlight().should(seeThat(MessageOf.thanks(), Matchers.equalTo("THANK YOU FOR CONTACTING US!")));
    }
}
