package cn.edu.lsu.demo.repository;

import cn.edu.lsu.demo.model.entity.PlanContent;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PlanContentRepository extends JpaRepository<PlanContent,Integer> {

    PlanContent findByPlanId(Integer planId);



}
