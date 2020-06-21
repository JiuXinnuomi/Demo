package cn.edu.lsu.demo.repository;

import cn.edu.lsu.demo.model.entity.PriPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriPlanRepository extends JpaRepository<PriPlan, Integer>  {

    PriPlan findAllByUserId(Integer Userid);


}
