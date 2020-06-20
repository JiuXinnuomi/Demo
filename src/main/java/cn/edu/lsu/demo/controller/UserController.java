package cn.edu.lsu.demo.controller;

import cn.edu.lsu.demo.model.dto.RegisterDTO;
import cn.edu.lsu.demo.model.vo.Response;
import cn.edu.lsu.demo.model.vo.Status;
import cn.edu.lsu.demo.model.vo.UserVO;
import cn.edu.lsu.demo.model.vo.status.Ok;
import cn.edu.lsu.demo.model.vo.status.UsernameIsExist;
import cn.edu.lsu.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Response<UserVO> register(@Valid RegisterDTO registerDTO){
        try {

            UserVO userVO = userService.register(registerDTO);
            return Response.success(userVO);
        } catch (RuntimeException e) {
            return Response.pack(UsernameIsExist.class);
        }
    }

}
