package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MissionRepository extends JpaRepository<Mission, Integer> {
    @Modifying(clearAutomatically = true)
    @Query("update Mission m set m.status =:status where m.mission_id =:mission_id")
    int updateBymission_id(@Param("status") String status, @Param("mission_id")String mission_id);
    Mission findByMission_idAndStatusEquals(String Mission_id, String status);
    Mission findByStatus(String status);
}
