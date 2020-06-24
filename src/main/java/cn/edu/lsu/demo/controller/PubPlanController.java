package cn.edu.lsu.demo.controller;



import cn.edu.lsu.demo.model.dto.AddPubPlanDTO;
import cn.edu.lsu.demo.model.dto.ChangePubPlanDTO;
import cn.edu.lsu.demo.model.dto.GetPubPlanDTO;
import cn.edu.lsu.demo.model.entity.User;

import cn.edu.lsu.demo.model.vo.PubPlanVO;
import cn.edu.lsu.demo.model.vo.status.Response;


import cn.edu.lsu.demo.model.vo.status.impl.AddPubPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.ChangePubPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.DelectPubPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.PubPlanIsExist;
import cn.edu.lsu.demo.service.PubPlanService;
import cn.graydove.security.annotation.CurrentUser;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
public class PubPlanController {

    private PubPlanService pubPlanService;


    public PubPlanController(PubPlanService pubPlanService){
        this.pubPlanService=pubPlanService;
    }





    @GetMapping("/Publan")
    public Response<List<PubPlanVO>> getPubPlan(@Valid GetPubPlanDTO getPubPlanDTO) {
        try {
            List<PubPlanVO> pvo=pubPlanService.GetPubPlan(getPubPlanDTO);

            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(PubPlanIsExist.class);
        }
    }

    @PostMapping("/PubPlan")
    public Response<PubPlanVO> AddPubPlan(@CurrentUser User user, @Valid AddPubPlanDTO addPriPlanDTO){
        try {
            PubPlanVO pvo=pubPlanService.AddPubPlan(addPriPlanDTO,user.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(AddPubPlanWrong.class);
        }

    }


    @PutMapping("/PubPlan")
    public Response<PubPlanVO> ChangePubPlan(@Valid ChangePubPlanDTO changePubPlanDTO, @CurrentUser User user){
        try {
            PubPlanVO pvo=pubPlanService.ChangePubPlan(changePubPlanDTO,user.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(ChangePubPlanWrong.class);
        }
    }

    @DeleteMapping("/Publan")
    public Response<PubPlanVO> DeletePriPlan(@Valid ChangePubPlanDTO changePubPlanDTO){
        try{
            PubPlanVO pvo=pubPlanService.DeletePubPlan(changePubPlanDTO.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(DelectPubPlanWrong.class);
        }
    }
}
