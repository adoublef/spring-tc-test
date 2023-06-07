package com.example.web.math;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/math")
public class MathController {
    @PostMapping("/length")
    public Double calculateLength(@Validated @RequestBody Point point) {
        var x = point.x();
        var y = point.y();
        var z = Math.sqrt(x * x + y * y);
        return z;
    }
}
