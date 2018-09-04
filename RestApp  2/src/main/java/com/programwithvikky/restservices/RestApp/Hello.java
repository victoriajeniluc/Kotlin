package com.programwithvikky.restservices.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; // in java, we have to import in all our dependencies

@RestController
public class Hello {

    // create a public method that will return a string back
    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
