package cn.edu.lsu.demo.controller;


import cn.edu.lsu.demo.model.dto.AddPriPlanDTO;
import cn.edu.lsu.demo.model.dto.ChangePriPlanDTO;
import cn.edu.lsu.demo.model.dto.GetPriPlanDTO;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.PriPlanVO;

import cn.edu.lsu.demo.model.vo.status.Response;
import cn.edu.lsu.demo.model.vo.status.impl.*;
import cn.edu.lsu.demo.service.PriPlanService;
import cn.graydove.security.annotation.CurrentUser;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
public class PriPlanController {
    private PriPlanService priPlanService;

    public PriPlanController(PriPlanService priPlanService){this.priPlanService=priPlanService;}


    @GetMapping("/PriPlan")
    public Response<List<PriPlanVO>> getPriPlan(@Valid GetPriPlanDTO getPriPlanDTO) {
        try {
            List<PriPlanVO> pvo=priPlanService.GetPriPlan(getPriPlanDTO);

            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(PriPlanIsExist.class);
        }
    }

    @PostMapping("/PriPlan")
    public Response<PriPlanVO> AddPriPlan(@CurrentUser User user,@Valid AddPriPlanDTO addPriPlanDTO){
        try {
            PriPlanVO pvo=priPlanService.AddPriPlan(addPriPlanDTO,user.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(AddPriPlanWrong.class);
        }

    }


    @PutMapping("/PriPlan")
    public Response<PriPlanVO> ChangePriPlan(@Valid ChangePriPlanDTO changePriPlanDTO,@CurrentUser User user){
        try {
            PriPlanVO pvo=priPlanService.ChangePriPlan(changePriPlanDTO,user.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(ChangePriPlanWrong.class);
        }
    }

    @DeleteMapping("/PriPlan")
    public Response<PriPlanVO> DeletePriPlan(@Valid ChangePriPlanDTO changePriPlanDTO){
        try{
            PriPlanVO pvo=priPlanService.DeletePriPlan(changePriPlanDTO.getId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(DelectPriPlanWrong.class);
        }
    }






}
