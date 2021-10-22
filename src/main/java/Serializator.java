import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Serializator {

    private static final String FILEPATH = "src/file.json";
    private static final String NEWFILEPATH = "src/myFile.json";

    public Gson gson;

    public void serialization() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            Writer writer = new FileWriter(NEWFILEPATH);
            gson.toJson(getChangedFields(), writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FIleDataSubscription getChangedFields() throws InvalidObjectException {
        FIleDataSubscription fIleDataSubscription = deserialization();
        fIleDataSubscription.setFleet(false);
        fIleDataSubscription.setDuration(5L);
        fIleDataSubscription.setRecreate(false);
        return fIleDataSubscription;
    }

    public FIleDataSubscription deserialization() throws InvalidObjectException {
        gson = new Gson();
        try {
            Reader reader = new FileReader(FILEPATH);
            return gson.fromJson(reader, FIleDataSubscription.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object fail");
    }
}