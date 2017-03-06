package com.example.component;

import com.example.repository.SourceConfigurationRepository;
import com.example.repository.entity.SourceConfigurationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableScheduling
public class ConfigurationJob {

    @Autowired
    SourceConfigurationRepository sourceConfigurationRepository;

//    @Scheduled(cron = "*/7 * * * * *")
    public void autoRefreshConfiguration() {
        SourceConfigurationEntity sourceConfigurationEntity = new SourceConfigurationEntity();
        sourceConfigurationEntity.setSourceId(3);

       Date today = new Date();
        sourceConfigurationEntity.setSourceValue(today.toString());
        sourceConfigurationEntity.setSourceKey("con2");
        sourceConfigurationEntity.setPropertySourceId(2);
        sourceConfigurationRepository.save(sourceConfigurationEntity);
        System.out.println("update key source ID 3---> " + today);
    }
}

