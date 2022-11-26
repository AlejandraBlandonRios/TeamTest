package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToContact implements Interaction {
    WebDriver chromeBrowser;
    public SwitchToContact(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement iframe = chromeBrowser.findElement(By.xpath("//*[@id='content']/section[7]/div/div/div/div/iframe"));
        actor.attemptsTo(Switch.toFrame(iframe));
    }
    public static SwitchToContact us(WebDriver chromeBrowser) {
        return Tasks.instrumented(SwitchToContact.class, chromeBrowser);
    }
}
