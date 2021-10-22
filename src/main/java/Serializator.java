import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Serializator {

    private static final String FILE_PATH = "src/information.json";
    private static final String NEW_FILE_PATH = "src/information-after-changes.json";

    private Gson gson;

    public void serialization (InformationSubscription informationSubscription) {
        gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter(NEW_FILE_PATH)) {
            gson.toJson(informationSubscription, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public InformationSubscription getChangedObject(InformationSubscription informationSubscription) {
        changeFields(informationSubscription);
        return informationSubscription;
    }

    public void changeFields(InformationSubscription informationSubscription) {
        informationSubscription.setFleet(false);
        informationSubscription.setDuration(5L);
        informationSubscription.setRecreate(false);
    }

    public InformationSubscription createObjectFromJSON() throws InvalidObjectException {
        gson = new Gson();
        try {
            return gson.fromJson(new FileReader(FILE_PATH), InformationSubscription.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object fail");
    }
}