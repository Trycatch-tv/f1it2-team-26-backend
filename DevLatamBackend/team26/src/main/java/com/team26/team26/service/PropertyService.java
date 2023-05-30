package com.team26.team26.service;

import com.team26.team26.dto.PropertyCreateDTO;
import com.team26.team26.dto.PropertyDTO;

public interface PropertyService {
    String addProperty(PropertyCreateDTO propertyCreateDTO);

    boolean deleteProperty(int id);
}
