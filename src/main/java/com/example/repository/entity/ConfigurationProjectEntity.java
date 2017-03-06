package com.example.repository.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIGURATION_PROJECT")
public class ConfigurationProjectEntity {

    @Id
    @Column(name = "PROJECT_ID")
    private Integer projectId;

    @Column(name = "PROPERTY_SOURCE_ID")
    private Integer propertySourceId;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "ENVIRONMENT_ID")
    private Integer environmentId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getPropertySourceId() {
        return propertySourceId;
    }

    public void setPropertySourceId(Integer propertySourceId) {
        this.propertySourceId = propertySourceId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(Integer environmentId) {
        this.environmentId = environmentId;
    }

    @Override
    public String toString() {
        return "ConfigurationProjectEntity{" +
                "projectId=" + projectId +
                ", propertySourceId=" + propertySourceId +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}

