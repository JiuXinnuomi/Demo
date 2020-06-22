package cn.edu.lsu.demo.controller;


import cn.edu.lsu.demo.model.dto.UserDTO;
import cn.edu.lsu.demo.model.vo.PriPlanVO;
import cn.edu.lsu.demo.model.vo.status.Response;
import cn.graydove.security.annotation.CurrentUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PriPlanController {

    @GetMapping("/priPlan")
    public Response<PriPlanVO> getPrivatePlan(@CurrentUser UserDTO user) {
        return Response.success();
    }
}
