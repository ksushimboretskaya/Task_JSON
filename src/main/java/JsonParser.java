import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {
    public static final String filePath = "src\\main\\resources\\file.json";

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            String concessionToInvoice = (String) jsonObject.get("concessionToInvoice");
            System.out.println("Concession to invoice is: " + concessionToInvoice);

            String packSubscriptionMessage = (String) jsonObject.get("packSubscriptionMessage");
            System.out.println("packSubscriptionMessage: " + packSubscriptionMessage);

            Boolean packPlanned = (Boolean) jsonObject.get("packPlanned");
            System.out.println("packPlanned: " + packPlanned.toString());

            Object customer = jsonObject.get("customer").toString();
            System.out.println("customer: " + customer);

            Object car = jsonObject.get("car").toString();
            System.out.println("car: " + car);

            String contractName = (String) jsonObject.get("contractName");
            System.out.println("contract name: " + contractName);

            String visibleContractsNames = (String) jsonObject.get("visibleContractsNames").toString();
            System.out.println("visibleContractsNames: " + visibleContractsNames);

            String visibleConcessions = (String) jsonObject.get("visibleConcessions").toString();
            System.out.println("visibleConcessions: " + visibleConcessions);

            String visibleBarnds = (String) jsonObject.get("visibleBrands").toString();
            System.out.println("visible brands: " + visibleBarnds);

            String startDate = (String) jsonObject.get("startDate");
            System.out.println("startDAte: " + startDate);

            Long duration = (Long) jsonObject.get("duration");
            System.out.println("duration" + duration);

            String optionNAme = (String) jsonObject.get("optionName");
            System.out.println("option name: " + optionNAme);

            String creditsNumber = (String) jsonObject.get("creditsNumber");
            System.out.println("credits number: " + creditsNumber);

            String cancel = (String) jsonObject.get("cancel");
            System.out.println("cancel: " + cancel);

            Boolean recreate = (Boolean) jsonObject.get("recreate");
            System.out.println("recreate: " + recreate.toString());

            String state = (String) jsonObject.get("state");
            System.out.println("state: " + state);

            String history = (String) jsonObject.get("history").toString();
            System.out.println("history: " + history);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
