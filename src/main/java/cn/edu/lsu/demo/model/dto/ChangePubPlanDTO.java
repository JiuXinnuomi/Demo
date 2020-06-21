package cn.edu.lsu.demo.model.dto;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ChangePubPlanDTO {

    private Integer id;

    @NotBlank(message = "持续时间不能为空")
    private Integer sustain;

    @NotBlank(message = "标题不能为空")
    private String Title;
}
