package tasks;

import interactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

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
                CheckMouseOverTrust.section(chromeBrowser),
                Scroll.to(LOCATIONS_SECTION),
                CheckMouseOverLocation.section(3,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(4,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(5,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(6,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(7,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(8,chromeBrowser),
                MoveToNextSubsectionOnLocation.section(chromeBrowser),
                CheckMouseOverLocation.section(9,chromeBrowser),
                Scroll.to(TOP_GUN_SECTION),
                CheckMouseOverTopGun.section(chromeBrowser),
                Scroll.to(EMPOWER_SECTION),
                CheckMouseOverEmpower.section(chromeBrowser),
                Scroll.to(CONTACT_SALES_SECTION)
        );
    }
    public static ScrollToTeam page(WebDriver chromeBrowser) {
        return Tasks.instrumented(ScrollToTeam.class,chromeBrowser);
    }
}
