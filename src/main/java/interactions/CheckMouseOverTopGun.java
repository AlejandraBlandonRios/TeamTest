package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMouseOverTopGun implements Interaction {
    WebDriver chromeBrowser;
    public CheckMouseOverTopGun(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='content']/section[5]/div/div/div[2]/div/div/a"))).perform();
    }
    public static CheckMouseOverTopGun section(WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouseOverTopGun.class, chromeBrowser);
    }
}
