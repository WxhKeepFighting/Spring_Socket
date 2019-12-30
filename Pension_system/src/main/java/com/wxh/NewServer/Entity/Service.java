package com.wxh.NewServer.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@Table(name = "service")
public class Service {
    @Id
    @NotBlank
    @Column(name = "mission_id", nullable = false)
    private String id;//主键任务id号
    @Column(name = "service_status", nullable = false)
    private String status;//服务状态
    @Column(name = "service_stime")
    private String stime;//服务开始时间
    @Column(name = "service_etime")
    private String etime;//服务结束时间
    @Column(name = "service_spic")
    private String spic;//服务开始图片
    @Column(name = "service_epic")
    private String epic;//服务结束图片
}
