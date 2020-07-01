package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.*;

import cn.edu.lsu.demo.model.vo.PlanContentVO;


public interface PlanContentService {

    PlanContentVO GetPlanContent(GetPlanContentDTO getPlanContentDTO);

    PlanContentVO AddPlanContent(AddPlanContentDTO addPlanContentDTO);

    PlanContentVO ChangePlanContent(ChangePlanContentDTO changePlanContentDTO);


    PlanContentVO DeletePlanContent(Integer planId);
}
