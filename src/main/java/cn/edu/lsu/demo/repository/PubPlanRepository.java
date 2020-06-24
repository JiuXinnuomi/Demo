package cn.edu.lsu.demo.repository;


import cn.edu.lsu.demo.model.entity.PubPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PubPlanRepository extends JpaRepository<PubPlan,Integer> {

    List<PubPlan> findByCreatorId(Integer creatorId);


}
