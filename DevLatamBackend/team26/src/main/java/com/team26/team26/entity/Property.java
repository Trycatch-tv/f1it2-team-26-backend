package com.team26.team26.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "property")
public class Property {
    @Id
    @Column(name = "property_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int property_id;
    @Column(name = "property_name", length = 50)
    private String property_name;
    @Column(name = "property_type", length = 50)
    private String property_type;
    @Column(name = "state", length = 50)
    private String state;
    @Column(name = "address", length = 50)
    private String address;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "area_size")
    private Float area_size;
    @Column(name = "price")
    private Float price;
    @Column(name = "characteristics", length = 50)
    private String characteristics;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "image", length = 250)
    private String image;
    @Column(name = "date_created")
    private LocalDateTime date_created;
    @PrePersist //Hora de registro en la base de datos
    public void prePersist() {
        date_created = LocalDateTime.now();
    }

    public Property(String property_name, String property_type, String state, String address, String city, Float area_size, Float price, String characteristics, String description, String image) {
        this.property_id = property_id;
        this.property_name = property_name;
        this.property_type = property_type;
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
