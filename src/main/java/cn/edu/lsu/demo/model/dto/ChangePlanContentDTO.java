package cn.edu.lsu.demo.model.dto;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ChangePlanContentDTO {



    private Integer PlanId;

    @NotBlank(message = "内容不能为空")
    private String content;

}
