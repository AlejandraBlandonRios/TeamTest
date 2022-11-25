package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMouseOverEmpower implements Interaction {
    WebDriver chromeBrowser;
    public CheckMouseOverEmpower(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='content']/section[6]/div/div/div/div/a"))).perform();
    }
    public static CheckMouseOverEmpower section(WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouseOverEmpower.class, chromeBrowser);
    }
}
