package ie.atu.projectcourseservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private CourseService courseService;
    private CourseConfirmationService courseConfirmationService;

    @Autowired
    public void setCourseService(CourseService courseService, CourseConfirmationService courseConfirmationService) {
        this.courseService = courseService;
        this.courseConfirmationService = courseConfirmationService;
    }

    @PostMapping("/enrollToCourse")
    public String enrollToCourse(@Valid @RequestBody Course course){
        courseService.enrollToCourse(course);
        return "Successfully enrolled course";
    }

    @GetMapping("/courseDetails")
    public @ResponseBody List<Course> getCourse() {return courseService.getCourseDetails(); }
}
