package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.AddPriPlanDTO;

import cn.edu.lsu.demo.model.dto.AddStarDTO;
import cn.edu.lsu.demo.model.dto.GetFocusedDTO;
import cn.edu.lsu.demo.model.dto.GetFocuserDTO;
import cn.edu.lsu.demo.model.vo.PriPlanVO;
import cn.edu.lsu.demo.model.vo.StarVO;

import java.util.List;

public interface StarService {

    List<StarVO> GetFocuser(GetFocuserDTO getFocuserDTO);


    StarVO AddStar(AddStarDTO addStarDTO, Integer userId);


    List<StarVO> GetFocused(GetFocusedDTO getFocusedDTO);

    StarVO DeleteStar(Integer id);
}
