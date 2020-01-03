package com.wxh.NewServer.Generator;

import com.wxh.NewServer.Generator.UserSystem;
import com.wxh.NewServer.Generator.UserSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSystemDao {
    long countByExample(UserSystemExample example);

    int deleteByExample(UserSystemExample example);

    int deleteByPrimaryKey(String sId);

    int insert(UserSystem record);

    int insertSelective(UserSystem record);

    List<UserSystem> selectByExample(UserSystemExample example);

    UserSystem selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") UserSystem record, @Param("example") UserSystemExample example);

    int updateByExample(@Param("record") UserSystem record, @Param("example") UserSystemExample example);

    int updateByPrimaryKeySelective(UserSystem record);

    int updateByPrimaryKey(UserSystem record);
}