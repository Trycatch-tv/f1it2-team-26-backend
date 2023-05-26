package com.team26.team26.service;

import com.team26.team26.controller.PropertyRepo.PropertyRepo;
import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.team26.team26.entity.Property;

@Service
public class PropertyServiceImpl implements PropertyService{
    @Autowired
    private PropertyRepo propertyRepo;
    @Override
    public String addProperty(PropertyCreateDTO propertyCreateDTO) {

        Property property = new Property(
                propertyCreateDTO.getProperty_name()
        );

        propertyRepo.save(property);
        return property.getProperty_name();

    }
}
