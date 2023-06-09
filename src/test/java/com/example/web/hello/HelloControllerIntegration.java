package com.example.web.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
@Import(HelloController.class)
public class HelloControllerIntegration {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testHello() throws Exception {
        mvc.perform(get("/hello/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!"));
    }
}
