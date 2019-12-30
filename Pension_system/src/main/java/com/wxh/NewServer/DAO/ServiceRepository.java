package com.wxh.NewServer.DAO;

import com.wxh.NewServer.Entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ServiceRepository extends JpaRepository<Service, String> {
    @Modifying(clearAutomatically = true)
    @Query("update Service s set s.status=:status,s.etime=:etime,s.epic=:epic where s.id=:id")
//    @Query(value = "update Service s set s.service_status=?1,s.service_etime=?2,s.service_epic=?3 where s.mission_id=?4")
//    int updateBymission_id(String status,String etime,String epic,String id);
    int updateBymission_id(@Param(value = "status") String status,@Param(value = "etime") String etime,@Param(value = "epic") String epic,@Param(value = "id") String id);
}
