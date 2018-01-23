package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demo")
public class DemoController {
	@RequestMapping("")
    String home() {
        return "Hello Demo!";
    }
   
   @PostMapping("")
    String home2() {
        return "bye DEmo";
    }
}
