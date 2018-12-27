package com.ideal.modules.kafka.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 封装WebSock API返回Event信息
 * @author Duke
 * @date 2018-12-12
 */
@Data
public class Message {
    private Long id; //id

    private String msg; //消息

    private Date sendTime; //时间戳


}
