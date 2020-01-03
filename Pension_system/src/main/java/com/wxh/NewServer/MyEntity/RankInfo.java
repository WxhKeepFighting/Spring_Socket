package com.wxh.NewServer.MyEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RankInfo {
    private String volunteerId;
    private String volunteerName;
    private int credit;
}
