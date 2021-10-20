import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Deserial deserial = new Deserial();
        MyJSON myJSON = deserial.deserialization();
        System.out.println("fleet: " + myJSON.isFleet() + "\n" +
                "cancel: " + myJSON.getCancel() + "\n" +
                "contract name: " + myJSON.getContractName() + "\n" +
                "concession to invoice: " + myJSON.getConcessionToInvoice()
        );

        Serializ serializ = new Serializ();
        serializ.Serialization();
    }
}
