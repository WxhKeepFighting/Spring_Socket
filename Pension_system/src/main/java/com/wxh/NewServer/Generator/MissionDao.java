package com.wxh.NewServer.Generator;

import com.wxh.NewServer.Generator.Mission;
import com.wxh.NewServer.Generator.MissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionDao {
    long countByExample(MissionExample example);

    int deleteByExample(MissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mission record);

    int insertSelective(Mission record);

    List<Mission> selectByExample(MissionExample example);

    Mission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByExample(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByPrimaryKeySelective(Mission record);

    int updateByPrimaryKey(Mission record);
}