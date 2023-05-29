package com.team26.team26.service;

import com.team26.team26.controller.PropertyRepo.PropertyRepo;
import com.team26.team26.dto.PropertyCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.team26.team26.entity.Property;

import java.util.UUID;

@Service
public class PropertyServiceImpl implements PropertyService{
    @Autowired
    private PropertyRepo propertyRepo;
    @Override
    public String addProperty(PropertyCreateDTO propertyCreateDTO) {

        Property property = new Property(
                propertyCreateDTO.getProperty_name(),
                propertyCreateDTO.getProperty_type(),
                propertyCreateDTO.getProperty_sale(),
                propertyCreateDTO.getState(),
                propertyCreateDTO.getAddress(),
                propertyCreateDTO.getCity(),
                propertyCreateDTO.getArea_size(),
                propertyCreateDTO.getPrice(),
                propertyCreateDTO.getCharacteristics(),
                propertyCreateDTO.getDescription(),
                propertyCreateDTO.getImage()
//              propertyCreateDTO.getDate_created()
        );

        propertyRepo.save(property);
        return property.getProperty_name();

    }

    @Override
    public boolean deleteProperty(int id) {
        if(propertyRepo.existsById(id)){
            propertyRepo.deleteById(id);
        }
        else {
            System.out.println("Property not found");
        }
        return true;
    }
}