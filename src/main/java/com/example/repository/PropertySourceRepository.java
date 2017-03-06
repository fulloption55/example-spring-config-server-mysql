package com.example.repository;

import com.example.repository.entity.PropertySourceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PropertySourceRepository extends CrudRepository<PropertySourceEntity, String> {
    PropertySourceEntity findOneByPropertySourceId(int propertySourceId);

}
