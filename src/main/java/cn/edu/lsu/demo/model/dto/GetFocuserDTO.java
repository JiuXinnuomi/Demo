package cn.edu.lsu.demo.model.dto;


import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotBlank;

@Data
public class GetFocuserDTO {


    private Integer userId;
}
