package com.wxh.NewServer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@Table(name = "User_system")
public class User_system {
    @Id
    @NotBlank
    private String s_id;
    private String s_password;
    private String role_id;
    private String active;
    public User_system(){}
}
