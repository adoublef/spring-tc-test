package com.example.web.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository
        extends CrudRepository<Course, Long> {
    List<Course> findByInstructor(String instructor);

    Course findById(long id);
}
