package cn.edu.lsu.demo.controller;


import cn.edu.lsu.demo.model.dto.*;
import cn.edu.lsu.demo.model.vo.PlanContentVO;
import cn.edu.lsu.demo.model.vo.status.Response;
import cn.edu.lsu.demo.model.vo.status.impl.*;
import cn.edu.lsu.demo.service.PlanContentService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class PlanContentController {

    private PlanContentService planContentService;

    public PlanContentController(PlanContentService planContentService) {
        this.planContentService = planContentService;
    }

    @GetMapping("/PlanContent")
    public Response<PlanContentVO> getPlanContent(@Valid GetPlanContentDTO getPlanContentDTO) {
        try {
            PlanContentVO pvo= planContentService.GetPlanContent(getPlanContentDTO);

            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(IsExist.class);
        }
    }

    @PostMapping("/PlanContent")
    public Response<PlanContentVO> AddPlanContent(@Valid AddPlanContentDTO addPlanContentDTO){
        try {
            PlanContentVO pvo=planContentService.AddPlanContent(addPlanContentDTO);
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(AddWrong.class);
        }

    }


    @PutMapping("/PlanContent")
    public Response<PlanContentVO> ChangePlanContent(@Valid ChangePlanContentDTO changePlanContentDTO){
        try {
            PlanContentVO pvo=planContentService.ChangePlanContent(changePlanContentDTO);
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(ChangeWrong.class);
        }
    }

    @DeleteMapping("/PlanContent")
    public Response<PlanContentVO> DeletePlanContent(@Valid ChangePlanContentDTO changePlanContentDTO){
        try{
            PlanContentVO pvo=planContentService.DeletePlanContent(changePlanContentDTO.getPlanId());
            return Response.success(pvo);
        } catch (RuntimeException e) {
            return Response.pack(DeleteWrong.class);
        }
    }

}
