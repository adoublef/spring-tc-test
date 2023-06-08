package com.example.web.course;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "/courses")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public UUID createCourse(@RequestBody CoursePending course) {
        var mapped = new Course(course.name(), course.instructor());
        var saved = courseRepository.save(mapped); // throws error
        return saved.getId();
    }

    public record CoursePending(String name, String instructor) {
    }

    public record CourseCreated(long id) {
    }
}
