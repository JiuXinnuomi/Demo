package cn.edu.lsu.demo.model.dto;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class GetPlanContentDTO {

    private Number planId;
}