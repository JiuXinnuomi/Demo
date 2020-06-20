package cn.edu.lsu.demo.controller;

import cn.edu.lsu.demo.model.entity.User;
import cn.edu.lsu.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public User register(String username, String password){
        return userService.register(username, password);
    }

    @GetMapping("/login")
    public User login(String username, String password){
        return userService.login(username, password);
    }
}
