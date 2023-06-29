package com.matiesmengo.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/resource/server")
public class ResourceServerController {

    @GetMapping()
    public String resourceServerController() {
        return "Resource Server";
    }
}