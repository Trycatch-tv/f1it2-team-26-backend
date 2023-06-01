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

    public ResponseDTO updatePropertyById(Property property, int id){
        ResponseDTO response = new ResponseDTO();
        Optional<Property> propertySearch = propertyRepo.findById(id);

        if(propertySearch.existsById(id)){
            propertySearch.
        }
    }


    @Override
    @Transactional
    public ResponseDTO updatePropertyById(Property property, int id){
        ResponseDTO response = new ResponseDTO();
        Optional<Property> propertyToUpdate = propertyRepo.findById(id);

        if(propertyToUpdate.isEmpty()){
            response.setMessage("Property no Found");
        } else{
            propertyToUpdate.get().setProperty_name(property.getProperty_name());
            propertyToUpdate.get().setProperty_type(property.getProperty_type());
            propertyToUpdate.get().setProperty_sale(property.getProperty_sale());
            propertyToUpdate.get().setState(property.getState());
            propertyToUpdate.get().setAddress(property.getAddress());
            propertyToUpdate.get().setCity(property.getCity());
            propertyToUpdate.get().setArea_size(property.getArea_size());
            propertyToUpdate.get().setPrice(property.getPrice());
            propertyToUpdate.get().setCharacteristics(property.getCharacteristics());
            propertyToUpdate.get().setDescription(property.getDescription());
            propertyToUpdate.get().setImage(property.getImage());

            propertyRepo.save(propertyToUpdate.get());
            response.setMessage("Successful update");
        }

        return response;

    }
}
