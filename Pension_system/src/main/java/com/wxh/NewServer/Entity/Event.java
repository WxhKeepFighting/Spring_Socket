package com.wxh.NewServer.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Data
@Table(name = "event")
public class Event{
    @Id
    @Column(name = "event_id",nullable = false)
    private String id;//事件id
    @Column(name = "event_mean", nullable = false)
    private String mean;//对应事件
    @Column(name = "credit", nullable = false)
    private Integer credit;//对应事件积分

}
