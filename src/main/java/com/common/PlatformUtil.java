package com.common;

import com.alibaba.fastjson.JSONObject;
import com.jeesite.modules.mission.entity.FormData;
import com.jeesite.modules.mission.entity.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class PlatformUtil {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${platform.Url}")
    private String PLATFORM_URL;

    private volatile String sessionid;

    public String login(){
        FormData formData =new FormData();
        formData.add("parameter","\"username\":\"cyhapi\",\"password\":\"Cyhapi@123\"");

        String url = PLATFORM_URL+"api/v2/login_auth/";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(
                formData.getMap(), headers);
        //发送请求，设置请求返回数据格式为String
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, request, String.class);

        HttpHeaders returnHeaders = responseEntity.getHeaders();
        List<String> auth = returnHeaders.get("Set-Cookie");
        sessionid = auth.get(1).split(";")[0].split("=")[1];
        return sessionid;
    }

    public JSONObject setMission(Mission mission){
        String url = mission.getType()=="temp"?
                PLATFORM_URL+"api/v2/vgroup/create_temp/":
                PLATFORM_URL+"api/v2/vgroup/create_cycle/";
        JSONObject result=new JSONObject();
        JSONObject plugin=new JSONObject();
        JSONObject enable=new JSONObject();
        enable.put("enabled","true");

        List<String> site = new ArrayList<>();
        String[] a=mission.getUrl().split(",");
        for (int i = 0; i < a.length; i++) {
            site.add("\""+a[i]+"\"");
        }
        if(mission.equals("true")){
            plugin.put("black_links", enable);
        }
        if(mission.equals("true")){
            plugin.put("malscan",enable);
        }
        if(mission.equals("true")){
            plugin.put("keyword",enable);
        }
        if(mission.equals("true")){
            plugin.put("sql",enable);
        }
        if(mission.equals("true")){
            plugin.put("xss",enable);
        }
        if(mission.equals("true")){
            plugin.put("webvul",enable);
        }
        if (mission.equals("true")){
            plugin.put("info_leak",enable);
        }
        if(mission.equals("true")){
            plugin.put("cgi",enable);
        }
        if (mission.equals("true")){
            plugin.put("csrf",enable);
        }
        if(mission.equals("true")){
            plugin.put("form_crack",enable);
        }

        result.put("site_list",site);
        result.put("plugin",plugin);
        result.put("name",mission.getName());
        FormData formData =new FormData();
        formData.add("parameter",result.toString());
        formData.add("sessionid",sessionid);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(
                formData.getMap(), headers);
        //发送请求，设置请求返回数据格式为String
        ResponseEntity<JSONObject> responseEntity = restTemplate.postForEntity(url, request, JSONObject.class);
        if(responseEntity.getBody().get("detail")!=null){
            formData.add("sessionid",login());
            request = new HttpEntity<MultiValueMap<String, String>>(
                    formData.getMap(), headers);
            responseEntity = restTemplate.postForEntity(url, request, JSONObject.class);
        }
        if(responseEntity.getBody().getJSONObject("message").getJSONArray("name")!=null){
            result.put("error","任务名已存在");
            return  result;
        }
        //String virtual_group_id=responseEntity.getBody().getJSONObject("result").get("virtual_group_id").toString();

        return responseEntity.getBody().getJSONObject("result");
    }
}
