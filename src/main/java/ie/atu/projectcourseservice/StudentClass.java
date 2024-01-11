package ie.atu.projectcourseservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClass {

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("age")
    private int age;

    @JsonProperty("email")
    private String email;

}
