package com.team26.team26.service;

import com.team26.team26.Repository.PropertyRepo;
import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.team26.team26.entity.Property;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{
    @Autowired
    private PropertyRepo propertyRepo;
    @Override
    public ResponseDTO addProperty(PropertyCreateDTO propertyCreateDTO) {
        ResponseDTO response = new ResponseDTO();
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
        response.setMessage("Successful Creation");
        return response;
    }

    @Override
    public List<Property> getAllProperties() {

        List<Property> properties=propertyRepo.findAll();

        return properties;
    }

    @Override
    public ResponseDTO deleteProperty(int id) {
        ResponseDTO response = new ResponseDTO();

        if(propertyRepo.existsById(id)){
            propertyRepo.deleteById(id);
            response.setMessage("Successful Removal");
        }
        else {
            response.setMessage("Property not Found");
        }
        return response;
    }

    @Override
    public Property getPropertyByID(int id) {

        Optional<Property> property= propertyRepo.findById(id);
        return property.get();
    }
}
