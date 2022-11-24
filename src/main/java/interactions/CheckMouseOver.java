package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMouseOver implements Interaction {
    WebDriver chromeBrowser;
    public CheckMouseOver(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        for (int i = 1; i <= 25; i++) {
            builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='logo-partners-"+i+"']"))).perform();
        }
    }
    public static CheckMouseOver trustSection(WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouseOver.class, chromeBrowser);
    }
}
