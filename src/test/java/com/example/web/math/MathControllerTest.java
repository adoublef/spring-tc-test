package com.example.web.math;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MathController.class)
@Import(MathController.class)
public class MathControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void validCalculation() throws Exception {
        mvc.perform(post("/math/length")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"x\": 3, \"y\": 4}"))
                .andExpect(status().isOk())
                .andExpect(content().string("5.0"));
    }

    @Test
    public void invalidValueType() throws Exception {
        mvc.perform(post("/math/length")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"x\": '3'}"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void invalidRequiredField() throws Exception {
        // why does this not work(?)
        mvc.perform(post("/math/length")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"y\": 4}"))
                .andExpect(status().isBadRequest());
    }
}
