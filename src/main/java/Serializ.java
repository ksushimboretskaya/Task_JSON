import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.Writer;

public class Serializ {

    private static final String file = "C:\\Users\\Ksusha\\Task_JSON\\src\\main\\resources\\myFile.json";

    public void Serialization()  {
        Deserial deserial = new Deserial();
        MyJSON myJSONActual = null;
        Writer writer;
        Gson gson;

        try {
            myJSONActual = deserial.deserialization();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

        MyJSON myJSON = new MyJSON(
                myJSONActual.isFleet(),
                "Name for Customer 5",
                "Citroën",
                myJSONActual.getStartDate(),
                5L,
                myJSONActual.getOptionName(),
                myJSONActual.getCreditsNumber(),
                myJSONActual.isPackPlanned(),
                myJSONActual.getPackSubscriptionMessage(),
                myJSONActual.getCancel(),
                myJSONActual.isRecreate(),
                myJSONActual.getState()
        );

        try {
            writer = new FileWriter(file);
            gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(myJSON));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
