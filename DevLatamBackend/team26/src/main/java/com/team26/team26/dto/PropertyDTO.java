package com.team26.team26.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class PropertyDTO {

    private int property_id;
    private String property_name;
    private String property_type;
    private String property_sale;
    private String state;
    private String address;
    private String city;
    private Float area_size;
    private Float price;
    private String characteristics;
    private String description;
    private String image;
    private LocalDateTime date_created;


    public PropertyDTO(int property_id, String property_name, String property_type, String property_sale ,String state, String address, String city, Float area_size, Float price, String characteristics, String description, String image, LocalDateTime date_created) {
        this.property_id = property_id;
        this.property_name = property_name;
        this.property_type = property_type;
        this.property_sale = property_sale;
        this.state = state;
        this.address = address;
        this.city = city;
        this.area_size = area_size;
        this.price = price;
        this.characteristics = characteristics;
        this.description = description;
        this.image = image;
        this.date_created = date_created;
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

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getProperty_sale() {
        return property_sale;
    }

    public void setProperty_sale(String property_sale) {
        this.property_sale = property_sale;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDateTime getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Property{" +
                "property_id=" + property_id +
                ", property_name='" + property_name + '\'' +
                ", property_type='" + property_type + '\'' +
                ", property_sale='" + property_sale + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", area_size=" + area_size +
                ", price=" + price +
                ", characteristics='" + characteristics + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", date_created=" + date_created +
                '}';
    }
}
