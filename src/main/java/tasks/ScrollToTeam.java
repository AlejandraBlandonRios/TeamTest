package tasks;

import interactions.CheckMouse;
import interactions.CheckMouseOver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAndHoldAction;

import static userinterface.TeamInternationalPageUserInterface.*;

public class ScrollToTeam implements Task {
    WebDriver chromeBrowser;
    public ScrollToTeam(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CheckMouse.overSection(1, 9, chromeBrowser),
                Scroll.to(SERVICES_SECTION),
                CheckMouse.overSection(2,7,chromeBrowser),
                Scroll.to(CLIENTS_SECTION),
                CheckMouseOver.trustSection(chromeBrowser),
                Scroll.to(LOCATIONS_SECTION)
        );
    }
    public static ScrollToTeam page(WebDriver chromeBrowser) {
        return Tasks.instrumented(ScrollToTeam.class,chromeBrowser);
    }
}
