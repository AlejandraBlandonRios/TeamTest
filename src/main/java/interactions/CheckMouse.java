package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckMouse implements Interaction {
    int sectionNumber;
    int subsections;
    WebDriver chromeBrowser;
    public CheckMouse(int sectionNumber, int subsections, WebDriver chromeBrowser) {
        this.sectionNumber = sectionNumber;
        this.subsections = subsections;
        this.chromeBrowser = chromeBrowser;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions builder = new Actions(chromeBrowser);
        for (int i = 1; i <= subsections; i++) {
            builder.moveToElement(chromeBrowser.findElement(By.xpath("//*[@id='content']/section["+sectionNumber+"]/div/div/div[2]/div/div/div["+i+"]"))).perform();
        }

    }
    public static CheckMouse overSection(int sectionNumber, int subsections, WebDriver chromeBrowser) {
        return Tasks.instrumented(CheckMouse.class, sectionNumber, subsections, chromeBrowser);
    }


}
