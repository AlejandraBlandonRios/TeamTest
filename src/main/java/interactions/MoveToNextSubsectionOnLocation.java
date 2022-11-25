package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToNextSubsectionOnLocation implements Interaction {
    WebDriver chromeBrowser;
    public MoveToNextSubsectionOnLocation(WebDriver chromeBrowser) {
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement we = chromeBrowser.findElement(By.xpath("/html/body/div[1]/div/section[4]/div/div/div[2]/div/div[3]/img[2]"));
        Actions actions = new Actions(chromeBrowser);
        actions.moveToElement(we);
        actions.doubleClick();
        actions.clickAndHold(we).moveByOffset(50,50).release().build().perform();
    }
    public static MoveToNextSubsectionOnLocation section(WebDriver chromeBrowser) {
        return Tasks.instrumented(MoveToNextSubsectionOnLocation.class,chromeBrowser);
    }


}
