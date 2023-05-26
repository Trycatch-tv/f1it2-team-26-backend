package com.team26.team26.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PropertyDTO {

    private int property_id;
    private String property_name;


    public PropertyDTO(int property_id, String property_name) {
        this.property_id = property_id;
        this.property_name = property_name;
    }

    public PropertyDTO() {
    }

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    @Override
    public String toString() {
        return "PropertyDTO{" +
                "property_id=" + property_id +
                ", property_name='" + property_name + '\'' +
                '}';
    }
}
