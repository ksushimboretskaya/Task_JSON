import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    private static final String FILE_PATH = "src/subscription.json";
    private static final String NEW_FILE_PATH = "src/subscription-after-changes.json";

    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        try {
            subscription = new Gson().fromJson(new FileReader(FILE_PATH), Subscription.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Subscription subscriptionChanged = subscription;
        subscriptionChanged.setFleet(false);
        subscriptionChanged.setContractName("Name for Customer 10");
        subscriptionChanged.setCancel("Other:description");

        try (Writer writer = new FileWriter(NEW_FILE_PATH)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(subscriptionChanged, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}