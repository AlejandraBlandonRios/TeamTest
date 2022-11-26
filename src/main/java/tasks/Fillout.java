package tasks;

import interactions.SwitchToContact;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

import static userinterface.TeamInternationalPageUserInterface.*;

public class Fillout implements Task {
    WebDriver chromeBrowser;
    public Fillout(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(CONTACT_SALES_SECTION),
                SwitchToContact.us(chromeBrowser),
                Click.on(FIRST_NAME_INPUT),
                Enter.theValue("Alejandra").into(FIRST_NAME_INPUT),
                Enter.theValue("Blandon").into(LAST_NAME_INPUT),
                Enter.theValue("Team International").into(COMPANY_INPUT),
                Enter.theValue("testing@hotmail.com").into(EMAIL_INPUT),
                Enter.theValue("5555555").into(PHONE_NUMBER_INPUT),
                Enter.theValue("Test message").into(MESSAGE_INPUT),
                Click.on(PRIVACY_POLICY_CHECKBOX),
                Click.on(ANNOUNCEMENTS_CHECKBOX),
                Click.on(CONTACT_SALES_BUTTON));
    }
    public static Fillout requiredInformation(WebDriver chromeBrowser) {
        return Tasks.instrumented(Fillout.class, chromeBrowser);
    }
}
