package cn.edu.lsu.demo.repository;

import cn.edu.lsu.demo.model.entity.PriPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriPlanRepository extends JpaRepository<PriPlan,Integer>  {

    List <PriPlan> findByUserId(Integer userId);

}
