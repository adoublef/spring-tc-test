package com.example.web.course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void notNull() {
        assert courseRepository != null;
    }

    @Test
    public void autoGenerateId() {
        var course = new Course("CS50 Java", "Mr John");

        // save into the database
        courseRepository.save(course);

        // the id should be generated

        System.out.println(course.getId());

        assert course.getId() == 1L;
    }

}
