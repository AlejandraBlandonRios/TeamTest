package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMouseOverTrust implements Interaction {
    WebDriver chromeBrowser;
    public CheckMouseOverTrust(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        for (int i = 1; i <= 25; i++) {
            builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='logo-partners-"+i+"']"))).perform();
        }
    }
    public static CheckMouseOverTrust section(WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouseOverTrust.class, chromeBrowser);
    }
}
