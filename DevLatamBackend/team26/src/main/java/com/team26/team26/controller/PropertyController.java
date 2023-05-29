package com.team26.team26.controller;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import com.team26.team26.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(value = "api/v1/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;
    @PostMapping(path = "/create")
    public String createProperty(@RequestBody PropertyCreateDTO propertyCreateDTO)
    {
        String id = propertyService.addProperty(propertyCreateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteproperty/{id}")
    public String deleteProperty(@PathVariable(value = "id") int id)
    {
        boolean deleteproperty = propertyService.deleteProperty(id);
        return "Property with id: " + id + " Deleted" ;
    }

}
