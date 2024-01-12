package ie.atu.projectcourseservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "elective-service", url = "$elective-service")
public interface ElectiveServiceClient {
    @PostMapping("/studentElective")
    String studentCourse(@RequestBody Course course);
}
