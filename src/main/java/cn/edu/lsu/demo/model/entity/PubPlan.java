package cn.edu.lsu.demo.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class PubPlan {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(length = 50, nullable = false)
    private Date createTime;


    @Column(length = 50, nullable = false)
    private String title;


    @Column(length = 50, nullable = false)
    private Integer sustain;

    private Integer creatorId;


}
