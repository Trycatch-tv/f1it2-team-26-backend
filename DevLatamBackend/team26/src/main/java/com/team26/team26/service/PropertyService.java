package com.team26.team26.service;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import com.team26.team26.dto.ResponseDTO;
import com.team26.team26.entity.Property;

import java.util.List;

public interface PropertyService {
    ResponseDTO addProperty(PropertyCreateDTO propertyCreateDTO);
    List<Property> getAllProperties();

    ResponseDTO deleteProperty(int id);
    Property getPropertyByID(int id);

    ResponseDTO updatePropertyById(Property property, int id);
}
