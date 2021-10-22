import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class FIleDataSubscription implements Serializable {
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

    private Map<String, String> customer;
    private Map<String, String> car;
    private Set<String> visibleContractsNames;
    private Set<String> visibleConcessions;
    private Set<String> visibleBrands;
    private Set<String> history;
}