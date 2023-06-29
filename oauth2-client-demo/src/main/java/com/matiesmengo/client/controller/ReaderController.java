package com.matiesmengo.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reader")
public class ReaderController {

    @GetMapping()
    public String getReader() {
        return "READER";
    }
}