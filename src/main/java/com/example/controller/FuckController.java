package com.example.controller;


import com.example.controller.response.ConfigResponse;
import com.example.controller.response.PropertySources;
import com.example.repository.ConfigurationProjectRepository;
import com.example.repository.EnvironmentRepository;
import com.example.repository.PropertySourceRepository;
import com.example.repository.SourceConfigurationRepository;
import com.example.repository.entity.ConfigurationProjectEntity;
import com.example.repository.entity.EnvironmentEntity;
import com.example.repository.entity.PropertySourceEntity;
import com.example.repository.entity.SourceConfigurationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FuckController {

    @Autowired
    ConfigurationProjectRepository configurationProject;
    @Autowired
    EnvironmentRepository environment;
    @Autowired
    PropertySourceRepository propertySource;
    @Autowired
    SourceConfigurationRepository sourceConfiguration;

    @RequestMapping(value = "/{applicationName}/{environmentName}", method = RequestMethod.GET)
    public ConfigResponse find(@PathVariable String applicationName, @PathVariable String environmentName) throws IOException {

        // 0. Resolve the environment
        EnvironmentEntity expectedEnvi = environment.findOneByEnvironmentName(environmentName);

        // 1. Find configuration for project
        //   1.1 For default configuration
        List<ConfigurationProjectEntity> configurationProjectDefaultList = configurationProject.findByProjectNameAndEnvironmentId(applicationName, 0);
        //   1.2 For expected configuration
        List<ConfigurationProjectEntity> configurationProjectEnviList = configurationProject.findByProjectNameAndEnvironmentId(applicationName, expectedEnvi.getEnvironmentId());
        configurationProjectEnviList.addAll(configurationProjectDefaultList);

        //   1.3 Prepare PropertySources response
        List<PropertySources> listPro = new ArrayList<>();

        for (ConfigurationProjectEntity temp : configurationProjectEnviList) {
            System.out.println(temp);
            //2. Find source configuration files
            PropertySourceEntity xx = propertySource.findOneByPropertySourceId(temp.getPropertySourceId().intValue());
            PropertySources ppts = new PropertySources();
            ppts.setName(xx.getPropertySourceName());
            //3. Find key/value from configuration file
            List<SourceConfigurationEntity> sceList = sourceConfiguration.findByPropertySourceId(xx.getPropertySourceId());

            Map tempSource = new HashMap<String, String>();
            for (SourceConfigurationEntity sce : sceList) {
                tempSource.put(sce.getSourceKey(), sce.getSourceValue());
            }

            ppts.setSource(tempSource);
            listPro.add(ppts);
        }

        ConfigResponse response = new ConfigResponse();
        response.setPropertySources(listPro);
        response.setVersion("1.00");
//        response.setLabel("master");
        String[] profilesEnvironment = {environmentName};
        response.setProfiles(profilesEnvironment);
        response.setName(applicationName);

        return response;
    }

}
