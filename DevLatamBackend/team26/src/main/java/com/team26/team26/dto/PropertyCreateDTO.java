package com.team26.team26.dto;

public class PropertyCreateDTO {

    private String property_name;


    public PropertyCreateDTO(String property_name) {
        this.property_name = property_name;
    }

    public PropertyCreateDTO() {
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
                ", property_name='" + property_name + '\'' +
                '}';
    }

}
