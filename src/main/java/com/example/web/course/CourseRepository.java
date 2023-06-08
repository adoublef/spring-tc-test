package com.example.web.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository
        extends CrudRepository<Course, Long> {
    // List<Course> findByInstructor(String instructor);

    // Course findById(long id);
}
