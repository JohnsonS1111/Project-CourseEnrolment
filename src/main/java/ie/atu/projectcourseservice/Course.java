package ie.atu.projectcourseservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @JsonProperty("CourseName")
    private String CourseName;

    @JsonProperty("CourseCode")
    private Long CourseCode;
}
