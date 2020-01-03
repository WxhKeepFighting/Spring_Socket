package com.wxh.NewServer.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "mission")
public class Mission{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//id表的主键
    @Column(name = "mission_id", nullable = false)
    private String mid;//任务id
    @Column(name = "mission_applicant_id", nullable = false)
    private String aid;//受服务者身份证
    @Column(name = "mission_volunteer_id", nullable = false)
    private String vid;//志愿者身份证
    @Column(name = "mission_event_id", nullable = false)
    private String eid;//事件id
    @Column(name = "mission_status", nullable = false)
    private String status;//任务完成情况

}
