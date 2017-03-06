package com.example.repository;

import com.example.repository.entity.ConfigurationProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ConfigurationProjectRepository extends CrudRepository<ConfigurationProjectEntity, String> {
    List<ConfigurationProjectEntity> findByProjectNameAndEnvironmentId(String projectName, int environmentId);

}
