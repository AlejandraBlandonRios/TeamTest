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
    String name;
    String lastName;
    String company;
    String email;
    String phone;
    String message;
    public Fillout(WebDriver chromeBrowser, String name, String lastName, String company, String email, String phone, String message) {
        this.chromeBrowser = chromeBrowser;
        this.name = name;
        this.lastName = lastName;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.message = message;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(CONTACT_SALES_SECTION),
                SwitchToContact.us(chromeBrowser),
                Click.on(FIRST_NAME_INPUT),
                Enter.theValue(name).into(FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(LAST_NAME_INPUT),
                Enter.theValue(company).into(COMPANY_INPUT),
                Enter.theValue(email).into(EMAIL_INPUT),
                Enter.theValue(phone).into(PHONE_NUMBER_INPUT),
                Enter.theValue(message).into(MESSAGE_INPUT),
                Click.on(PRIVACY_POLICY_CHECKBOX),
                Click.on(ANNOUNCEMENTS_CHECKBOX),
                Click.on(CONTACT_SALES_BUTTON));
    }
    public static Fillout requiredInformation(WebDriver chromeBrowser, String name, String lastName, String company, String email, String phone, String message) {
        return Tasks.instrumented(Fillout.class, chromeBrowser, name, lastName, company, email, phone, message);
    }
}
