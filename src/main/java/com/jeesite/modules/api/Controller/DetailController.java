package com.jeesite.modules.api.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeesite.modules.api.Service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "${adminPath}/detail")
public class DetailController {

    public static String virtual_group_id;
    public static String url;

    @Autowired
    private DetailService detailService;

    @ResponseBody
    @RequestMapping(value = "/tree",method= RequestMethod.GET)
    public JSONArray getTree(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url){
        return detailService.getTreeService(virtual_group_id,url);
    }

    @RequestMapping(value = {"list", ""})
    public String list(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url) {

        return "detailPage/detailPage";
    }

    @ResponseBody
    @RequestMapping(value = "/overview1",method= RequestMethod.GET)
    public JSONObject getOverview1(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url){
        JSONObject object=new JSONObject();
        object.put("fraction",84);
        object.put("danger",17);
        object.put("average",14);
        object.put("low",15);
        return object;
    }

    @ResponseBody
    @RequestMapping(value = "/overview2",method= RequestMethod.GET)
    public JSONArray getOverview2(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url){
        JSONArray result=new JSONArray();
        JSONObject weakness1 =new JSONObject();
        weakness1.put("name","发现备份文件");
        weakness1.put("size","2");
        weakness1.put("level","average");
        result.add(weakness1);
        JSONObject weakness2 =new JSONObject();
        weakness2.put("name","不安全的crossdomain.xml配置文件");
        weakness2.put("size","2");
        weakness2.put("level","low");
        result.add(weakness2);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/siteInfo",method= RequestMethod.GET)
    public JSONObject getSiteInfo(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url){
        JSONObject object=new JSONObject();
        object.put("pr", null);
        object.put("alexa", 343267);
        object.put("whois", "2019年06月14日");
        object.put("title", "Home of Acunetix Art");
        object.put("ip", "176.28.50.165");
        object.put("server", "nginx/1.4.1");
        object.put("host", "testphp.vulnweb.com");
        object.put("location", null);
        object.put("icp", null);
        object.put("os", null);
        return object;
    }
    @ResponseBody
    @RequestMapping(value = "/availability",method= RequestMethod.GET)
    public JSONObject getAvailability(@RequestParam("virtual_group_id") String virtual_group_id, @RequestParam("url")String url){
        JSONObject object=new JSONObject();
        object.put("created_at","2019-01-03 11:09:11");
        object.put("ping", 194);
        object.put("hijacked", false);
        object.put("dns_time", 4);
        object.put("time", 782);
        return object;
    }
}
