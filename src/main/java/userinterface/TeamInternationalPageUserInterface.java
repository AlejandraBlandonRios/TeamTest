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
    public static final Target FIRST_NAME_INPUT = Target.the("First name input").
            located(By.xpath("//input[@data-id='firstName']"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").
            located(By.xpath("//input[@data-id='lastName']"));
    public static final Target COMPANY_INPUT = Target.the("Company name input").
            located(By.xpath("//input[@data-id='company']"));
    public static final Target EMAIL_INPUT = Target.the("Email input").
            located(By.xpath("//input[@data-id='email']"));
    public static final Target PHONE_NUMBER_INPUT = Target.the("Phone number input").
            located(By.xpath("//input[@data-id='phone']"));
    public static final Target MESSAGE_INPUT = Target.the("Message input").
            located(By.xpath("//input[@data-id='message']"));
    public static final Target PRIVACY_POLICY_CHECKBOX = Target.the("Privacy policy checkbox").
            located(By.xpath("(//span[@class='checkmark'])[1]"));
    public static final Target ANNOUNCEMENTS_CHECKBOX = Target.the("Announcements checkbox").
            located(By.xpath("(//span[@class='checkmark'])[2]"));
    public static final Target THANKS_MESSAGE = Target.the("Thanks message").
            located(By.xpath("//*[@class='submit-button']"));

}
