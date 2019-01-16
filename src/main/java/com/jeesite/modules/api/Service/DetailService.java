package com.jeesite.modules.api.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Service;

@Service
public class DetailService {




    public JSONArray getTreeService(String virtual_group_id, String url) {
        JSONArray one = new JSONArray();
        JSONObject mainUrl = new JSONObject();
        mainUrl.put("url","http://testphp.vulnweb.com");
        JSONObject children1=new JSONObject();
        JSONObject children2=new JSONObject();
        JSONObject two = new JSONObject();

        JSONArray twoArray1 = new JSONArray();

        //封装等级和网址
        JSONObject level1 = new JSONObject();
        JSONObject url1 = new JSONObject();
        JSONObject name1 = new JSONObject();

        JSONArray urlArray1 = new JSONArray();

        urlArray1.add("http://testphp.vulnweb.com/userinfo.php");
        level1.put("level","danger");
        url1.put("url",urlArray1);
        name1.put("name","表单弱口令");

        twoArray1.add(name1);
        twoArray1.add(level1);
        twoArray1.add(url1);
        JSONArray twoArray2=new JSONArray();
        JSONObject level2 = new JSONObject();
        JSONObject name2 = new JSONObject();
        name2.put("name","我咋知道");
        level2.put("level","average");
        twoArray2.add(name2);
        twoArray2.add(level2);
        twoArray2.add(url1);


        children1.put("children",twoArray1);
        children2.put("children",twoArray2);



        one.add(mainUrl);
        one.add(children1);
        one.add(children2);

        return one;
    }
}
