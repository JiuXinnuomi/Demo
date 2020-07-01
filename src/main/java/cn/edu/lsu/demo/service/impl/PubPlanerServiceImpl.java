package cn.edu.lsu.demo.service.impl;

import cn.edu.lsu.demo.model.dto.*;

import cn.edu.lsu.demo.model.entity.PubPlaner;

import cn.edu.lsu.demo.model.vo.PubPlanerVO;
import cn.edu.lsu.demo.repository.PubPlanerRepository;
import cn.edu.lsu.demo.service.PubPlanerService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class PubPlanerServiceImpl implements PubPlanerService {


    private PubPlanerRepository pubPlanerRepository;


    public PubPlanerServiceImpl(PubPlanerRepository pubPlanerRepository) {
        this.pubPlanerRepository = pubPlanerRepository;
    }

    @Override
    public List<PubPlanerVO> GetPubPlaner(GetPubPlanerDTO getPubPlanerDTO){
        List<PubPlaner> p=pubPlanerRepository.findAllByPlanId(getPubPlanerDTO.getPlanId());

        List<PubPlanerVO> resultList= new ArrayList<>();
        BeanUtils.copyProperties(p,resultList);

        return resultList;
    }

    @Override
    public PubPlanerVO AddPubPlaner(AddPubPlanerDTO addPubPlanerDTO, Integer userId) {

        PubPlaner p = new PubPlaner();
        p.setPlanId(addPubPlanerDTO.getPlanId());
        p.setUserId(userId);

        p = pubPlanerRepository.save(p);

        PubPlanerVO pVO = new PubPlanerVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }



    @Override
    public PubPlanerVO DeletePubPlaner(DeletePubPlanerDTO deletePubPlanerDTO){

        PubPlaner p=pubPlanerRepository.findByPlanIdAndUserId(deletePubPlanerDTO.getPlanId(),deletePubPlanerDTO.getUserId());
        pubPlanerRepository.deleteById(p.getId());

        PubPlanerVO pVO = new PubPlanerVO();
        BeanUtils.copyProperties(p, pVO);
        return pVO;
    }










}
