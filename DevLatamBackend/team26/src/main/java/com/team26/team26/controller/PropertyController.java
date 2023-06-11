package com.team26.team26.controller;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import com.team26.team26.dto.ResponseDTO;
import com.team26.team26.entity.Property;
import com.team26.team26.service.PropertyService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

@RequestMapping(value = "api/v1/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;
    @PostMapping(path = "/create")
    public ResponseDTO createProperty(@RequestBody PropertyCreateDTO propertyCreateDTO)
    {
        ResponseDTO response = propertyService.addProperty(propertyCreateDTO);
        return response;
    }

    @GetMapping(path = "/getall")
    public List<Property> getAllProperties()
    {
        List<Property> properties = propertyService.getAllProperties();

        return properties;
    }

    @GetMapping(path = "/{id}")
    public Property getPropertyByID(@PathVariable int id)
    {
        Property propertie = propertyService.getPropertyByID(id);

        return propertie;
    }

    @DeleteMapping(path = "/deleteproperty/{id}")
    public ResponseDTO deleteProperty(@PathVariable(value = "id") int id)
    {
        ResponseDTO response = propertyService.deleteProperty(id);
        return response;
    }

    @PutMapping(path = "/update/{id}")
    public ResponseDTO updateProperty(@RequestBody Property property, @PathVariable(value = "id") int id)
    {
        ResponseDTO response = propertyService.updatePropertyById(property,id);
        return response;
    }

}
