import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;

public class Deserial {
    private static final String filePath = "C:\\Users\\Ksusha\\Task_JSON\\src\\file.json";

    public MyJSON deserialization() throws InvalidObjectException {

        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            Gson gson = new Gson();
            MyJSON myJSON = gson.fromJson(String.valueOf(jsonObject), MyJSON.class);
            return myJSON;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object fail");
    }
}
