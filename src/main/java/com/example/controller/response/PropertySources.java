package com.example.controller.response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Theerut on 12/15/2016 AD.
 */
public class PropertySources {

    private String name;

    private Map<String, String> source = new HashMap<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getSource() {
        return source;
    }

    public void setSource(Map<String, String> source) {
        this.source = source;
    }


//}

}
