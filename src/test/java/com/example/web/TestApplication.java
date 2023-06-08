package com.example.web;

public class TestApplication {
    public static void main(String[] args) {
        var application = Application.createSpringApplication();

        // Here we add the same initializer as we were using in our tests...
        application.addInitializers(new AbstractIntegration.Initializer());

        // ... and start it normally
        application.run(args);
    }
}
