package com.example.testjacksonannotation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @PostMapping
    public void test(@RequestBody TestDto testDto) {
        System.out.println(testDto.name());
    }
}
