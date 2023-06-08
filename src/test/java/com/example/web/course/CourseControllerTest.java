package com.example.web.course;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.web.AbstractIntegration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
public class CourseControllerTest extends AbstractIntegration {
    @Autowired
    private MockMvc mvc;

    @Test
    public void addCourse() throws Exception {
        var payload = """
                {
                    "name": "CS50 Java",
                    "instructor": "Mr John"
                }
                """;

        var result = mvc.perform(post("/courses/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(payload))
                .andExpect(status().isCreated())
                .andReturn();

        var content = result.getResponse().getContentAsString();

        System.out.println(content);
    }
}
