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
    public static final Target TOP_GUN_SECTION = Target.the("Top Gun Lab section").
            located(By.xpath("//*[@id='content']/section[5]"));
    public static final Target EMPOWER_SECTION = Target.the("Empower your career section").
            located(By.xpath("//*[@id='content']/section[6]"));
    public static final Target CONTACT_SALES_SECTION = Target.the("Contact Sales section").
            located(By.xpath("//*[@id='content']/section[7]"));
}
