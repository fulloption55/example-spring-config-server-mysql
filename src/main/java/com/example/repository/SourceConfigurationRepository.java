package com.example.repository;

import com.example.repository.entity.SourceConfigurationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface SourceConfigurationRepository extends CrudRepository<SourceConfigurationEntity, String> {
    List<SourceConfigurationEntity> findByPropertySourceId(Integer propertySourceId);

}
