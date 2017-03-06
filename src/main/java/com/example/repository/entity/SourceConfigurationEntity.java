package com.example.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="SOURCE_CONFIGURATION")
public class SourceConfigurationEntity {

    @Id
    @Column(name = "SOURCE_ID")
    private Integer sourceId;

    @Column(name = "PROPERTY_SOURCE_ID")
    private Integer propertySourceId;

    @Column(name = "SOURCE_KEY")
    private String sourceKey;

    @Column(name = "SOURCE_VALUE")
    private String sourceValue;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getPropertySourceId() {
        return propertySourceId;
    }

    public void setPropertySourceId(Integer propertySourceId) {
        this.propertySourceId = propertySourceId;
    }

    public String getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }
}
