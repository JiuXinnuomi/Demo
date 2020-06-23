package cn.edu.lsu.demo.service;


import cn.edu.lsu.demo.model.dto.AddPriPlanDTO;
import cn.edu.lsu.demo.model.dto.ChangePriPlanDTO;
import cn.edu.lsu.demo.model.dto.GetPriPlanDTO;
import cn.edu.lsu.demo.model.entity.PriPlan;
import cn.edu.lsu.demo.model.vo.PriPlanVO;

import java.util.List;

public interface PriPlanService {

    List<PriPlanVO> GetPriPlan(GetPriPlanDTO getPriPlanDTO);

    PriPlanVO AddPriPlan(AddPriPlanDTO addPriPlanDTO,Integer userId);

    PriPlanVO ChangePriPlan(ChangePriPlanDTO changePriPlanDTO);


    PriPlanVO DelectPriPlan(Integer id);

}
