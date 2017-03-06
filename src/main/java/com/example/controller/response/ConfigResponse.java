package com.example.controller.response;

import java.util.List;

/**
 * Created by Theerut on 12/15/2016 AD.
 */
public class ConfigResponse {

    private String name;

    private String[] profiles;

    private String version;

    private List<PropertySources> propertySources;

    public List<PropertySources> getPropertySources() {
        return propertySources;
    }

    public void setPropertySources(List<PropertySources> propertySources) {
        this.propertySources = propertySources;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getProfiles ()
    {
        return profiles;
    }

    public void setProfiles (String[] profiles)
    {
        this.profiles = profiles;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

}
