package cn.edu.lsu.demo.model.dto;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ChangeUserDTO {


    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "昵称不能为空")
    private String nickname;

    @NotBlank(message = "密码不能为空")
    private String password;


}
