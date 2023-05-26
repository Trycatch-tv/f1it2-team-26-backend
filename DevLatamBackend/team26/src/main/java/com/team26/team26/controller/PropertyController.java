package com.team26.team26.controller;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import com.team26.team26.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "api/v1/property")
public class PropertyController {
    // @Autowired
    // TestService service;
    //
    //
    // @GetMapping(path = "hola")
    // public TestResponseDTO test(@RequestBody TestRequestDTO request){
    //     return service.testHolaMundo(request);
    // }
    @Autowired
    private PropertyService propertyService;
    @PostMapping(path = "/create")
    public String createProperty(@RequestBody PropertyCreateDTO propertyCreateDTO)
    {
        String id = propertyService.addProperty(propertyCreateDTO);
        return id;
    }

}
