package com.example.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROPERTY_SOURCE")
public class PropertySourceEntity {

    @Id
    @Column(name = "PROPERTY_SOURCE_ID")
    private Integer propertySourceId;

    @Column(name = "PROPERTY_SOURCE_NAME")
    private String propertySourceName;

    public Integer getPropertySourceId() {
        return propertySourceId;
    }

    public void setPropertySourceId(Integer propertySourceId) {
        this.propertySourceId = propertySourceId;
    }

    public String getPropertySourceName() {
        return propertySourceName;
    }

    public void setPropertySourceName(String propertySourceName) {
        this.propertySourceName = propertySourceName;
    }
}
