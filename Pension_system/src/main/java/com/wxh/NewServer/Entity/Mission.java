package com.wxh.NewServer.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Mission{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "mission_id", nullable = false)
    private String mission_id;//id表的主键
    @Column(name = "mission_applicant_id", nullable = false)
    private String applicant_id;//受服务者身份证
    @Column(name = "mission_volunteer_id", nullable = false)
    private String volunteer_id;//志愿者身份证
    @Column(name = "mission_event_id", nullable = false)
    private String event_id;//事件id
    @Column(name = "mission_status", nullable = false)
    private String status;//任务完成情况
}
