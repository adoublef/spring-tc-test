package com.example.web.math;

public record Point(
        int x,
        int y) {

    public Point(int x, int y) {
        // x or y is not valid
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }
}
