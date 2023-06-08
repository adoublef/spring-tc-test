package com.example.web;

public class TestApplication {
    public static void main(String[] args) {
        var app = Application.createSpringApplication();

        app.addInitializers(new AbstractIntegration.Initializer());

        app.run(args);
    }
}
