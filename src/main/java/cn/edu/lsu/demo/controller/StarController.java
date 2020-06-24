package cn.edu.lsu.demo.controller;


import cn.edu.lsu.demo.model.dto.*;
import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.model.vo.PriPlanVO;
import cn.edu.lsu.demo.model.vo.StarVO;
import cn.edu.lsu.demo.model.vo.status.Response;
import cn.edu.lsu.demo.model.vo.status.impl.AddPriPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.ChangePriPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.DelectPriPlanWrong;
import cn.edu.lsu.demo.model.vo.status.impl.PriPlanIsExist;
import cn.edu.lsu.demo.repository.StarRepository;
import cn.edu.lsu.demo.service.StarService;
import cn.graydove.security.annotation.CurrentUser;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StarController {

    private StarService starService;


    public StarController(StarService starService){this.starService=starService;}


    @GetMapping("/focused")
    public Response<List<StarVO>> getfocused(@Valid GetFocusedDTO getFocusedDTO) {
        try {
            List<StarVO> svo=starService.GetFocused(getFocusedDTO);

            return Response.success(svo);
        } catch (RuntimeException e) {
            return Response.pack(PriPlanIsExist.class);
        }
    }


    @GetMapping("/focuser")
    public Response<List<StarVO>> getfocuser(@Valid GetFocuserDTO getFocuserDTO) {
        try {
            List<StarVO> svo=starService.GetFocuser(getFocuserDTO);

            return Response.success(svo);
        } catch (RuntimeException e) {
            return Response.pack(PriPlanIsExist.class);
        }
    }



    @PostMapping("/Star")
    public Response<StarVO> AddStar(@CurrentUser User user, @Valid AddStarDTO addStarDTO){
        try {
           StarVO svo=starService.AddStar(addStarDTO,user.getId());
            return Response.success(svo);
        } catch (RuntimeException e) {
            return Response.pack(AddPriPlanWrong.class);
        }

    }




    @DeleteMapping("/Star")
    public Response<StarVO> DeleteStar(@Valid DeleteStarDTO DTO){
        try{
            StarVO svo=starService.DeleteStar(DTO.getId());

            return Response.success(svo);
        } catch (RuntimeException e) {
            return Response.pack(DelectPriPlanWrong.class);
        }
    }




}
