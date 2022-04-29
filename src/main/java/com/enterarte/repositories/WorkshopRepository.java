package com.enterarte.repositories;

import com.enterarte.entities.Workshop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop, String>  {
   
    @Query("SELECT w FROM Workshop w WHERE w.teacher.id = :id")
public List<Workshop>FindbyWorkshop(@Param("id") String id);
    
}
