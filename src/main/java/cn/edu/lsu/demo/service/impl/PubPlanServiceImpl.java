package cn.edu.lsu.demo.service.impl;



import cn.edu.lsu.demo.model.dto.AddPubPlanDTO;
import cn.edu.lsu.demo.model.dto.ChangePubPlanDTO;
import cn.edu.lsu.demo.model.dto.GetPubPlanDTO;
import cn.edu.lsu.demo.model.entity.PubPlan;

import cn.edu.lsu.demo.model.vo.PubPlanVO;

import cn.edu.lsu.demo.repository.PubPlanRepository;
import cn.edu.lsu.demo.service.PubPlanService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Service
public class PubPlanServiceImpl implements PubPlanService {

    private PubPlanRepository pubPlanRepository;

    public PubPlanServiceImpl(PubPlanRepository pubPlanRepository)
    {

        this.pubPlanRepository = pubPlanRepository;
    }


    @Override
    public List<PubPlanVO> GetPubPlan (GetPubPlanDTO getPubPlanDTO){
        List<PubPlan> pub=pubPlanRepository.findByCreatorId(getPubPlanDTO.getCreatorId());
        List<PubPlanVO> resultList= new ArrayList<>();
        BeanUtils.copyProperties(resultList,pub);

        return resultList;

    }

    @Override
    public PubPlanVO AddPubPlan(AddPubPlanDTO addPubPlanDTO, Integer userId) {

        PubPlan p = new PubPlan();
        p.setSustain(addPubPlanDTO.getSustain());
        p.setTitle(addPubPlanDTO.getTitle());
        p.setCreateTime(new Date());
        p.setCreatorId(userId);

        p = pubPlanRepository.save(p);

        PubPlanVO pVO = new PubPlanVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }


    @Override
    public PubPlanVO ChangePubPlan(ChangePubPlanDTO changePubPlanDTO, Integer userId){



        PubPlanVO pVO = new PubPlanVO();
        pubPlanRepository.findById(changePubPlanDTO.getId()).ifPresent((p -> {
            if(Objects.equals(userId, p.getCreatorId())){
                p.setSustain(changePubPlanDTO.getSustain());
                p.setTitle(changePubPlanDTO.getTitle());
                p=pubPlanRepository.save(p);

                BeanUtils.copyProperties(p, pVO);
            }
        }));
        return pVO;



    }


    @Override
    public PubPlanVO DeletePubPlan(Integer id){
        PubPlan p = new PubPlan();
        pubPlanRepository.deleteById(id);
        PubPlanVO pVO = new PubPlanVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }
}
