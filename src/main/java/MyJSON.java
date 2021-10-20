import java.io.Serializable;

public class MyJSON implements Serializable {
    private boolean fleet;
    private String contractName;
    private String concessionToInvoice;
    private String startDate;
    private Long duration;
    private String optionName;
    private String creditsNumber;
    private boolean packPlanned;
    private String packSubscriptionMessage;
    private String cancel;
    private boolean recreate;
    private String state;

    public MyJSON(boolean fleet, String contractName, String concessionToInvoice, String startDate, Long duration, String optionName, String creditsNumber, boolean packPlanned, String packSubscriptionMessage, String cancel, boolean recreate, String state) {
        this.fleet = fleet;
        this.contractName = contractName;
        this.concessionToInvoice = concessionToInvoice;
        this.startDate = startDate;
        this.duration = duration;
        this.optionName = optionName;
        this.creditsNumber = creditsNumber;
        this.packPlanned = packPlanned;
        this.packSubscriptionMessage = packSubscriptionMessage;
        this.cancel = cancel;
        this.recreate = recreate;
        this.state = state;
    }

    public boolean isFleet() {
        return fleet;
    }

    public void setFleet(boolean fleet) {
        this.fleet = fleet;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getConcessionToInvoice() {
        return concessionToInvoice;
    }

    public void setConcessionToInvoice(String concessionToInvoice) {
        this.concessionToInvoice = concessionToInvoice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getCreditsNumber() {
        return creditsNumber;
    }

    public void setCreditsNumber(String creditsNumber) {
        this.creditsNumber = creditsNumber;
    }

    public boolean isPackPlanned() {
        return packPlanned;
    }

    public void setPackPlanned(boolean packPlanned) {
        this.packPlanned = packPlanned;
    }

    public String getPackSubscriptionMessage() {
        return packSubscriptionMessage;
    }

    public void setPackSubscriptionMessage(String packSubscriptionMessage) {
        this.packSubscriptionMessage = packSubscriptionMessage;
    }

    public String getCancel() {
        return cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public boolean isRecreate() {
        return recreate;
    }

    public void setRecreate(boolean recreate) {
        this.recreate = recreate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
