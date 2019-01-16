package com.jeesite.modules.mission.service;

import com.alibaba.fastjson.JSONObject;
import com.common.PlatformUtil;
import com.jeesite.modules.mission.entity.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    private PlatformUtil platformUtil=new PlatformUtil();

    public JSONObject setMissionService (Mission mission){
        return platformUtil.setMission(mission);
    }
}
