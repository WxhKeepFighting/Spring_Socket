package com.wxh.NewServer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_system")
public class User_system {
    @Id
    @NotBlank
    @Column(name = "s_id", nullable = false)
    private String username;
    @Column(name = "s_password",nullable = false)
    private String password;
    @Column(name = "role_id", nullable = false)
    private String role;
    @NotBlank
    private String active;
}
