package com.jeesite.modules.mission.entity;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class FormData {

    private MultiValueMap<String, String> map;

    public FormData() {
        map =  new LinkedMultiValueMap<String, String>();
    }

    public void add(String key,String value){
        map.add(key,value);
    }

    public MultiValueMap<String, String> getMap() {
        return map;
    }
}
