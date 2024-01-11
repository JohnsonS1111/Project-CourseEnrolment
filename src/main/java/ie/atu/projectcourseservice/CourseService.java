package ie.atu.projectcourseservice;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private final CourseConfirmationService courseConfirmationService;

    public CourseService(CourseConfirmationService courseConfirmationService){
        this.courseConfirmationService = courseConfirmationService;
    }

    public String confirmCourse(String CourseName, String CourseCode){
        courseConfirmationService.sendEmail(CourseCode, " - This email is sent as confirmation that you have been registered for the course: " +CourseName);
        return "CourseName: " + CourseName + " CourseCode: " + CourseCode;
    }
}
