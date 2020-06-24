package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.*;

import cn.edu.lsu.demo.model.vo.PubPlanVO;

import java.util.List;

public interface PubPlanService {


    List<PubPlanVO> GetPubPlan(GetPubPlanDTO getPubPlanDTO);

    PubPlanVO AddPubPlan(AddPubPlanDTO addPubPlanDTO, Integer userId);

    PubPlanVO ChangePubPlan(ChangePubPlanDTO changePubPlanDTO,Integer userId);


    PubPlanVO DeletePubPlan(Integer id);


}
