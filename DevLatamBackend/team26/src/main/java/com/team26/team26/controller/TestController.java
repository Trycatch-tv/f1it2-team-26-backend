package com.team26.team26.controller;

import com.team26.team26.dto.TestRequestDTO;
import com.team26.team26.dto.TestResponseDTO;
import com.team26.team26.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    TestService service;


    @GetMapping(path = "hola")
    public TestResponseDTO test(@RequestBody TestRequestDTO request){
        return service.testHolaMundo(request);
    }

}
