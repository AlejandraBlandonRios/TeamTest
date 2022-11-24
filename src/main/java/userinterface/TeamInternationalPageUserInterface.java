package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.teaminternational.com/")
public class TeamInternationalPageUserInterface extends PageObject{
    public static final Target SERVICES_SECTION = Target.the("Services section").
            located(By.xpath("//*[@id='content']/section[2]"));
    public static final Target CLIENTS_SECTION = Target.the("Clients section").
            located(By.xpath("//*[@id='content']/section[3]"));
    public static final Target LOCATIONS_SECTION = Target.the("Locations section").
            located(By.xpath("//*[@id='content']/section[4]"));
    public static final Target RIGHT_ARROW_BUTTON = Target.the("Right arrow button").
            located(By.className("//*[@id='content']/section[4]/div/div/div[2]/div/div[3]/img[2]"));
    public static final Target PORTUGAL_SUBSECTION = Target.the("Portugal Subsection").
            located(By.className("//*[@id='content']/section[4]/div/div/div[2]/div/div[3]/div/div/div[4]/div[2]/a"));
}
