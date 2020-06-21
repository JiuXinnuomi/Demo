package cn.edu.lsu.demo.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class PlanContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    private Integer planId;


    @Column(length = 100, nullable = false)
    private String content;
}
