import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Customer {
    private String gender;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String occupation;
}