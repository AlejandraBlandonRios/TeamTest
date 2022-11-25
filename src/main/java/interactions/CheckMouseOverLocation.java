package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckMouseOverLocation implements Interaction {
    WebDriver chromeBrowser;
    int subsection;
    public CheckMouseOverLocation(int subsection, WebDriver chromeBrowser) {
        this.subsection = subsection;
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='content']/section[4]/div/div/div[2]/div/div[3]/div/div/div["+subsection+"]/div[2]/a"))).perform();
    }
    public static CheckMouseOverLocation section(int subsection, WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouseOverLocation.class, subsection, chromeBrowser);
    }


}
