package com.jeesite.modules.api.Controller;



import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "${adminPath}/index")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/infoBox",method= RequestMethod.POST)
    public JSONObject getInfoBox(){
        JSONObject object =new JSONObject();
        object.put("average", 37);
        object.put("low",50);
        object.put("danger", 40);
        object.put("urls",4);
        return object;
    }

    @ResponseBody
    @RequestMapping(value = "/histogram",method= RequestMethod.POST)
    public JSONArray getHistogram() {
        JSONArray array=new JSONArray();
        JSONObject a = new JSONObject();
        a.put("url", "http://testphp.vulnweb.com");
        a.put("fraction",83);
        array.add(a);
        JSONObject b =new JSONObject();
        b.put("url", "http://testaspnet.vulnweb.com");
        b.put("fraction",41);
        array.add(b);
        JSONObject c= new JSONObject();
        c.put("url", "http://testasp.vulnweb.com");
        c.put("fraction",67);
        array.add(c);
        return array;

    }


    @ResponseBody
    @RequestMapping(value = "/sheet",method = RequestMethod.POST)
    public JSONArray getSheet(){
        JSONArray result=new JSONArray();
        JSONObject object1=new JSONObject();
        JSONObject object2=new JSONObject();
        object1.put("url","http://woyaosile.com");
        object1.put("black_links","2");
        object1.put("malscan","1");
        object1.put("keyword","2");
        object1.put("sqli","0");
        object1.put("xss","5");
        object1.put("webvul","17");
        object1.put("info_leak","30");
        object1.put("cgi","0");
        object1.put("csrf","0");
        object1.put("form_crack","1");
        object1.put("virtual_group_id","5c35b0de43b9090192bfacc0");
        result.add(object1);
        object2.put("url","http://woyaosile2.com");
        object2.put("black_links","131");
        object2.put("malscan","1235123");
        object2.put("keyword","8283781");
        object2.put("sqli","1314");
        object2.put("xss","8");
        object2.put("webvul","7");
        object2.put("info_leak","1");
        object2.put("cgi","2333");
        object2.put("csrf","6666");
        object2.put("form_crack","7777");
        object2.put("virtual_group_id","5c340c3f43b90901afbfad17");
        result.add(object2);
        return result;
    }


}