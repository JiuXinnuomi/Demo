package cn.edu.lsu.demo.service.impl;


import cn.edu.lsu.demo.model.dto.*;

import cn.edu.lsu.demo.model.entity.Star;

import cn.edu.lsu.demo.model.vo.StarVO;
import cn.edu.lsu.demo.repository.StarRepository;
import cn.edu.lsu.demo.service.StarService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class StarServiceImpl implements StarService {

    private StarRepository starRepository;

    public StarServiceImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }


    @Override
    public List<StarVO> GetFocuser (GetFocuserDTO getFocuserDTO){
        List<Star> star=starRepository.findAllByFocuserId(getFocuserDTO.getUserId());
        List<StarVO> resultList= new ArrayList<>();
        BeanUtils.copyProperties(resultList,star);

        return resultList;

    }

    public List<StarVO> GetFocused(GetFocusedDTO getFocusedDTO){
        List<Star> star=starRepository.findAllByFocusedId(getFocusedDTO.getUserId());
        List<StarVO> resultList= new ArrayList<>();

        BeanUtils.copyProperties(resultList,star);

        return resultList;
    }


    @Override
    public StarVO AddStar(AddStarDTO addStarDTO, Integer userId) {

        Star s = new Star();
        s.setFocuserId(userId);
        s.setFocusedId(addStarDTO.getUserId());

        s = starRepository.save(s);

        StarVO sVO = new StarVO();
        BeanUtils.copyProperties(s, sVO);
        return sVO;
    }




    @Override
    public StarVO DeleteStar(Integer id){
        Star s = new Star();
        starRepository.deleteById(id);
        StarVO sVO = new StarVO();
        BeanUtils.copyProperties(s, sVO);
        return sVO;
    }
}
