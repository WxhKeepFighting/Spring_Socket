package com.wxh.NewServer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVolunteer {
    @Id
    @Column(name = "v_id",nullable = false)
    private String vid;
    @Column(name = "v_name")
    private String vname;
    @Column(name = "v_address")
    private String vaddress;
    private String active;
}
