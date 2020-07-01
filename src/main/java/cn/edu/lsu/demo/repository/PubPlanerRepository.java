package cn.edu.lsu.demo.repository;



import cn.edu.lsu.demo.model.entity.PubPlaner;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PubPlanerRepository extends JpaRepository<PubPlaner,Integer> {

    List<PubPlaner> findAllByPlanId(Integer planId);

    PubPlaner findByPlanIdAndUserId(Integer planId,Integer UserId);


}
