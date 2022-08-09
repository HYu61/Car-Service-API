package com.udacity.pricing.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: Heng Yu
 */
@RestController
@RequestMapping("/actuator/info")
public class InfoController {

    @GetMapping
    public String displayInfo(){
        return "Working on it!";
    }
}
