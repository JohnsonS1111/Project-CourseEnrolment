package ie.atu.projectcourseservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final List<Course> courses = new ArrayList<>();

    public void enrollToCourse(Course course) { courses.add(course); }
    public List<Course> getCourseDetails(){
        return courses;
    }
}
