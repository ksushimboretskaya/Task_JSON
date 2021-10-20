import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJson {

    public static void main(String[] args) throws IOException, ParseException {

        ChangeJSON changeJSON = new ChangeJSON();

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONObject customerFirstName = new JSONObject();
        JSONObject customerGender = new JSONObject();
        JSONObject customerLastName = new JSONObject();
        JSONObject customerPhoneNumber = new JSONObject();

        jsonObject.put("fleet", true);

        String concession = changeJSON.changeConcessionToInvoice();
        jsonObject.put("concessionToInvoice", concession);

        String subscriptionMessage = changeJSON.changeSubscriptionMessage();
        jsonObject.put("subscriptionMessage", subscriptionMessage);

        Boolean planned = changeJSON.changePackPlanned();
        jsonObject.put("packPlanned", planned);

        customerFirstName.put("firstName", "AutoFleet7");
        customerGender.put("gender", "Mme");
        customerLastName.put("lastName", "TestFleet7");
        customerPhoneNumber.put("phoneNumber", "TestFleet7");

        jsonArray.add(customerFirstName);
        jsonArray.add(customerLastName);
        jsonArray.add(customerGender);
        jsonArray.add(customerPhoneNumber);

        jsonObject.put("customer", jsonArray);

        try {
            FileWriter fileWriter = new FileWriter("src\\main\\resources\\myFile.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: " + jsonObject);
    }
}
