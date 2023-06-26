package com.techprimers.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class HelloResource {

    @GetMapping
    public String hello() {
        //Go to service java class
        //service can go, then to repository class (dbase stuff)...etc..
        //the return from service can be String
        String response = "REST API Response - came from other java classes";
        return response;
        //return "Hello Youtube!";
    }
}
