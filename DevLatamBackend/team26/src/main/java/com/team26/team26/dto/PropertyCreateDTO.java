package com.team26.team26.dto;

public class PropertyCreateDTO {

    private String property_name;
    private String property_type;
    private String state;
    private String address;
    private String city;
    private Float area_size;
    private Float price;
    private String characteristics;
    private String description;

    public PropertyCreateDTO() {
    }

    public PropertyCreateDTO(String property_name, String property_type, String state, String address, String city, Float area_size, Float price, String characteristics, String description) {
        this.property_name = property_name;
        this.property_type = property_type;
        this.state = state;
        this.address = address;
        this.city = city;
        this.area_size = area_size;
        this.price = price;
        this.characteristics = characteristics;
        this.description = description;
    }


    public String getProperty_name() {
        return property_name;
    }

    public void setProperty_name(String property_name) {
        this.property_name = property_name;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getArea_size() {
        return area_size;
    }

    public void setArea_size(Float area_size) {
        this.area_size = area_size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PropertyDTO{" +
                ", property_name='" + property_name + '\'' +
                ", property_type='" + property_type + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", area_size=" + area_size +
                ", price=" + price +
                ", characteristics='" + characteristics + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
