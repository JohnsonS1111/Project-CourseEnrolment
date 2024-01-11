package ie.atu.projectcourseservice;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CourseControllerIntegrationTest {
    private final MockMvc mockMvc;
    private final ObjectMapper objectMapper;

    @Autowired
    public CourseControllerIntegrationTest(MockMvc mockMvc, ObjectMapper objectMapper){
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }

    @Test
    public void testValidCourseController() throws Exception{
        Course validCourse = new Course();
        validCourse.setCourseCode("1234F");
        validCourse.setCourseName("Economics");
        String requestBody = objectMapper.writeValueAsString(validCourse);
    }

    @Test
    public void testInvalidCourseController() throws Exception{
        Course validCourse = new Course();
        validCourse.setCourseCode("1234");
        validCourse.setCourseName("");
        String requestBody = objectMapper.writeValueAsString(validCourse);
    }
}
