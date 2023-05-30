package com.team26.team26.service;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;
import com.team26.team26.entity.Property;

import java.util.List;

public interface PropertyService {
    String addProperty(PropertyCreateDTO propertyCreateDTO);
    List<Property> getAllProperties();

    boolean deleteProperty(int id);
    Property getPropertyByID(int id);
}
