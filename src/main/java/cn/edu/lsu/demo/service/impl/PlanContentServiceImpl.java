package cn.edu.lsu.demo.service.impl;

import cn.edu.lsu.demo.model.dto.AddPlanContentDTO;
import cn.edu.lsu.demo.model.dto.ChangePlanContentDTO;
import cn.edu.lsu.demo.model.dto.GetPlanContentDTO;
import cn.edu.lsu.demo.model.entity.PlanContent;

import cn.edu.lsu.demo.model.vo.PlanContentVO;

import cn.edu.lsu.demo.repository.PlanContentRepository;
import cn.edu.lsu.demo.service.PlanContentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PlanContentServiceImpl implements PlanContentService {

    private PlanContentRepository planContentRepository;

    public PlanContentServiceImpl(PlanContentRepository planContentRepository) {
        this.planContentRepository = planContentRepository;
    }

    @Override
    public PlanContentVO GetPlanContent(GetPlanContentDTO getPlanContentDTO){

        PlanContentVO pvo=new PlanContentVO();
        PlanContent p=planContentRepository.findByPlanId(getPlanContentDTO.getPlanId());
        BeanUtils.copyProperties(p,pvo);

        return pvo;


    }


    public PlanContentVO AddPlanContent(AddPlanContentDTO addPlanContentDTO){

        PlanContent p = new PlanContent();
        p.setPlanId(addPlanContentDTO.getPlanId());
        p.setContent(addPlanContentDTO.getContent());

        p = planContentRepository.save(p);

        PlanContentVO pVO = new PlanContentVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;

    }

    public PlanContentVO ChangePlanContent(ChangePlanContentDTO changePlanContentDTO){
        PlanContent p=planContentRepository.findByPlanId(changePlanContentDTO.getPlanId());

        p.setContent(changePlanContentDTO.getContent());

        p=planContentRepository.save(p);

        PlanContentVO pVO = new PlanContentVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;

    }


    public PlanContentVO DeletePlanContent(Integer planId){
        PlanContent p=planContentRepository.findByPlanId(planId);


        planContentRepository.deleteById(p.getId());
        PlanContentVO pVO = new PlanContentVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;


    }


}
