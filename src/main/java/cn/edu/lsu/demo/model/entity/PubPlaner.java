package cn.edu.lsu.demo.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class PubPlaner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



    private Integer userId;



    private Integer planId;


}
