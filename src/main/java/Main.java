import java.io.InvalidObjectException;

public class Main {

    public static void main(String[] args) throws InvalidObjectException {
        Serializator serializator = new Serializator();
        InformationSubscription informationSubscription = serializator.createObjectFromJSON();
        serializator.serialization(serializator.getChangedObject(informationSubscription));
    }
}