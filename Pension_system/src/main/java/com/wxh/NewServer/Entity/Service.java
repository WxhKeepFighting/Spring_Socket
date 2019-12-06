package com.wxh.NewServer.Entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table(name = "service")
public class Service {
    @Id
    @NotBlank
    private String mission_id;//主键任务id号
    private String service_status;//服务状态
    private String service_stime;//服务开始时间
    private String service_etime;//服务结束时间
    private String service_spic;//服务开始图片
    private String service_epic;//服务结束图片

    public Service(){}
}
