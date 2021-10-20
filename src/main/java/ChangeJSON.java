import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ChangeJSON {
    public static final String filePath = "src\\main\\resources\\file.json";

    FileReader reader = new FileReader(filePath);
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

    public ChangeJSON() throws IOException, ParseException {
    }

    public String changeConcessionToInvoice() {
        String concessionToInvoice = (String) jsonObject.get("concessionToInvoice");
        System.out.println("Concession to invoice is: " + concessionToInvoice);
        concessionToInvoice = "Citroën";
        System.out.println("new concession to invoice: " + concessionToInvoice);
        return concessionToInvoice;
    }

    public String changeSubscriptionMessage() {
        String packSubscriptionMessage = (String) jsonObject.get("packSubscriptionMessage");
        System.out.println("packSubscriptionMessage: " + packSubscriptionMessage);
        packSubscriptionMessage = "subscription started";
        System.out.println("new subscription message: " + packSubscriptionMessage);
        return packSubscriptionMessage;
    }

    public boolean changePackPlanned() {
        Boolean packPlanned = (Boolean) jsonObject.get("packPlanned");
        System.out.println("packPlanned: " + packPlanned.toString());
        packPlanned = false;
        System.out.println("new pack planned: " + packPlanned.toString());
        return packPlanned;
    }
}
