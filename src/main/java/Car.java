import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Car  {
    private String plateNumber;
    private String brand;
    private String model;
    private String quantity;
}
