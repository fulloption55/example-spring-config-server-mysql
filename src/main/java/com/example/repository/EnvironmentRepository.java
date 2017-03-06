package com.example.repository;

import com.example.repository.entity.EnvironmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EnvironmentRepository extends CrudRepository<EnvironmentEntity, String> {
    EnvironmentEntity findOneByEnvironmentId(int environmentId);
    EnvironmentEntity findOneByEnvironmentName(String environmentName);
}
