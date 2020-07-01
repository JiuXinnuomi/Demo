package cn.edu.lsu.demo.controller;

import cn.edu.lsu.demo.model.dto.*;
import cn.edu.lsu.demo.model.entity.User;

import cn.edu.lsu.demo.model.vo.PubPlanerVO;
import cn.edu.lsu.demo.model.vo.status.Response;

import cn.edu.lsu.demo.model.vo.status.impl.ChangeWrong;
import cn.edu.lsu.demo.model.vo.status.impl.DeleteWrong;
import cn.edu.lsu.demo.model.vo.status.impl.IsExist;

import cn.edu.lsu.demo.service.PubPlanerService;
import cn.graydove.security.annotation.CurrentUser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

public class PubPlanerController {

    private PubPlanerService pubPlanerService;


    public PubPlanerController(PubPlanerService pubPlanerService){
        this.pubPlanerService=pubPlanerService;
    }

    @GetMapping("/Publaner")
    public Response<List<PubPlanerVO>> getPubPlaner(@Valid GetPubPlanerDTO getPubPlanerDTO) {
        try {
            List<PubPlanerVO> pvo=pubPlanerService.GetPubPlaner(getPubPlanerDTO);

            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(IsExist.class);
        }
    }

    @PostMapping("/PubPlaner")
    public Response<PubPlanerVO> AddPubPlaner(@CurrentUser User user, @Valid AddPubPlanerDTO addPriPlanerDTO){
        try {
            PubPlanerVO pvo=pubPlanerService.AddPubPlaner(addPriPlanerDTO,user.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(ChangeWrong.class);
        }

    }


    @DeleteMapping("/Publaner")
    public Response<PubPlanerVO> DeletePriPlaner(@Valid DeletePubPlanerDTO deletePubPlanerDTO){
        try{
            PubPlanerVO pvo=pubPlanerService.DeletePubPlaner(deletePubPlanerDTO);
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(DeleteWrong.class);
        }
    }



}
