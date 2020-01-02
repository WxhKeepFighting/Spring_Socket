package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
    @Modifying(clearAutomatically = true)//进行更新操作才使用的注解
    @Query("update Mission m set m.status =:status where m.mid =:mission_id")
    int updateByMid(@Param("status") String status, @Param("mission_id")String mission_id);
    Mission findByStatusAndVid(String status, String Volunteer_id);
}
