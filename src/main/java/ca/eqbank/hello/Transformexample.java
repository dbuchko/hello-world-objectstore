package ca.eqbank.hello;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class Transformexample extends AbstractMessageTransformer {

    @Override
    public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
        // TODO Auto-generated method stub
        User user = (User)message.getPayload();
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
}