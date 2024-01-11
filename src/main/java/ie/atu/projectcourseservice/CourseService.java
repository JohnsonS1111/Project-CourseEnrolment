package ie.atu.projectcourseservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseConfirmationService courseConfirmationService;
    private final List<Course> courses = new ArrayList<>();

    public CourseService(CourseConfirmationService courseConfirmationService){
        this.courseConfirmationService = courseConfirmationService;
    }

    public void enrollToCourse(Course course) { courses.add(course); }
    public List<Course> getCourseDetails(){
        return courses;
    }

    public String confirmCourse(String CourseName, String CourseCode){
        courseConfirmationService.sendEmail(CourseCode, " - This email is sent as confirmation that you have been registered for the course: " +CourseName);
        return "CourseName: " + CourseName + " CourseCode: " + CourseCode;
    }
}
