package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.TeamInternationalPageUserInterface.THANKS_MESSAGE;

public class MessageOf implements Question<String> {
    public static MessageOf thanks() {
        return new MessageOf();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(THANKS_MESSAGE).viewedBy(actor).asString();
    }
}
