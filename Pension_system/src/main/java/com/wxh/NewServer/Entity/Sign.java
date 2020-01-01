package com.wxh.NewServer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sign {

    private String event_id;//服务事件id
    private String mission_id;//任务id
    private String applicant_id;//受服务者身份证号
    private String volunteer_id;//志愿者身份证号
    private String service_stime;//服务签到时间
    private String service_etime;//结束签到时间
    private String service_spic;//服务签到图片
    private String service_epic;//结束签到图片
    private String status;//服务状态

}
