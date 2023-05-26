package com.team26.team26.entity;

import javax.persistence.*;
@Entity
@Table(name = "property")
public class Property {
    @Id
    @Column(name = "property_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int property_id;
    @Column(name = "property_name", length = 50)
    private String property_name;

    public Property(int property_id, String property_name) {
        this.property_id = property_id;
        this.property_name = property_name;
    }


    public Property(String property_name) {
        this.property_name = property_name;
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
        return "Property{" +
                "property_id=" + property_id +
                ", property_name='" + property_name + '\'' +
                '}';
    }
}
