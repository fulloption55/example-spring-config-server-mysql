package com.example.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "ENVIRONMENT")
public class EnvironmentEntity {

    @Id
    @Column(name = "ENVIRONMENT_ID")
    private Integer environmentId;

    @Column(name = "ENVIRONMENT_NAME")
    private String environmentName;

    public Integer getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(Integer environmentId) {
        this.environmentId = environmentId;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
}
