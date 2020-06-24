package cn.edu.lsu.demo.service.impl;


import cn.edu.lsu.demo.model.dto.AddPriPlanDTO;
import cn.edu.lsu.demo.model.dto.ChangePriPlanDTO;
import cn.edu.lsu.demo.model.dto.GetPriPlanDTO;

import cn.edu.lsu.demo.model.entity.PriPlan;

import cn.edu.lsu.demo.repository.PriPlanRepository;
import cn.edu.lsu.demo.service.PriPlanService;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import cn.edu.lsu.demo.model.vo.PriPlanVO;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class PriPlanServiceImpl implements PriPlanService {

    private PriPlanRepository priPlanRepository;

    public PriPlanServiceImpl(PriPlanRepository priPlanRepository)
    {
        this.priPlanRepository = priPlanRepository;
    }


    @Override
    public List<PriPlanVO> GetPriPlan (GetPriPlanDTO getPriPlanDTO){
        List<PriPlan> pri=priPlanRepository.findByUserId(getPriPlanDTO.getUserId());
        List<PriPlanVO> resultList= new ArrayList<>();
        BeanUtils.copyProperties(resultList,pri);

        return resultList;

    }

    @Override
    public PriPlanVO AddPriPlan(AddPriPlanDTO addPriPlanDTO,Integer userId) {

        PriPlan p = new PriPlan();
        p.setSustain(addPriPlanDTO.getSustain());
        p.setContent(addPriPlanDTO.getContent());
        p.setCreateTime(new Date());
        p.setUserId(userId);

        p = priPlanRepository.save(p);

        PriPlanVO pVO = new PriPlanVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }

    @Override
    public PriPlanVO ChangePriPlan(ChangePriPlanDTO changePriPlanDTO,Integer userId){


        PriPlanVO pVO = new PriPlanVO();
        priPlanRepository.findById(changePriPlanDTO.getId()).ifPresent((p -> {
            if(Objects.equals(userId, p.getUserId())){
                p.setSustain(changePriPlanDTO.getSustain());
                p.setContent(changePriPlanDTO.getContent());
                p=priPlanRepository.save(p);

                BeanUtils.copyProperties(p, pVO);
            }
        }));
        return pVO;
    }


    @Override
    public PriPlanVO DeletePriPlan(Integer id){
        PriPlan p = new PriPlan();
        priPlanRepository.deleteById(id);
        PriPlanVO pVO = new PriPlanVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }



}
