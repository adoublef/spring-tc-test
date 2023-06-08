package com.example.web.course;

import com.example.web.AbstractIntegration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseRepositoryTest extends AbstractIntegration {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void notNull() {
        assert courseRepository != null;
    }

    @Test
    public void addCourse() {
        var course = new Course("CS50 Java", "Mr John");

        courseRepository.save(course);

        assert course.getId() != null;
    }

}
