import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Subscription {
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

    private Customer customer;
    private Car car;

    private List<String> visibleContractsNames;
    private List<String> visibleConcessions;
    private List<String> visibleBrands;
    private List<String> history;
}