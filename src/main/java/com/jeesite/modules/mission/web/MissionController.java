package com.jeesite.modules.mission.web;

import com.alibaba.fastjson.JSONObject;
import com.jeesite.modules.mission.entity.Mission;
import com.jeesite.modules.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping(value = "${adminPath}/mission")
public class MissionController {

    @Autowired
    MissionService missionService;

    @ResponseBody
    @RequestMapping(value = "/setMission",method= RequestMethod.POST)
    public JSONObject setMission(@RequestBody Mission mission){
        System.out.println("1111111111111111111111111111111111111111111111111111111111111111");
        System.out.println(mission);
        System.out.println("222222222222222222222222222222222222222222222222222222222222222");
        JSONObject object=new JSONObject();
        object.put("info","success");
        return  object;
        //return missionService.setMissionService(mission);
    }

    @RequestMapping(value = {"list", ""})
    public String list() {
        return "missionPage/missionPage";
    }

}
