package ie.atu.projectcourseservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService, CourseConfirmationService courseConfirmationService) {
        this.courseService = courseService;
    }

    @PostMapping("/enrollToCourse")
    public String enrollToCourse(@Valid @RequestBody Course course){
        courseService.enrollToCourse(course);
        return "Successfully enrolled course";
    }

    @GetMapping("/courseDetails")
    public @ResponseBody List<Course> getCourse() {return courseService.getCourseDetails(); }

    @PostMapping("/confirmEnrolment")
    public String courseRequest(@RequestBody StudentClass studentClass){
        return String.format("Received Request for %s %s. This is a valid registration",
                studentClass.getFirstname(), studentClass.getSurname());
    }
}
