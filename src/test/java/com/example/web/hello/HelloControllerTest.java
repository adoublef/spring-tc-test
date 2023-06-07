package com.example.web.hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class HelloControllerTest {

    @Test
    public void testHello() throws Exception {
        var helloController = new HelloController();
        assert helloController.hello().equals("Hello World!");
    }
}
