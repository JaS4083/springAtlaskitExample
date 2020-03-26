package com.atlasmicros.atlasmicros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }

    @RequestMapping("/hello")
    public String helloWorld() { return "World";}
}