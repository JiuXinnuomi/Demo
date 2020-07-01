package cn.edu.lsu.demo.service;

import cn.edu.lsu.demo.model.dto.*;

import cn.edu.lsu.demo.model.vo.PubPlanerVO;


import java.util.List;

public interface PubPlanerService {

    List<PubPlanerVO> GetPubPlaner(GetPubPlanerDTO getPubPlanerDTO);


    PubPlanerVO AddPubPlaner(AddPubPlanerDTO addPubPlanerDTO,Integer userId);


    PubPlanerVO DeletePubPlaner(DeletePubPlanerDTO deletePubPlanerDTO);

}
