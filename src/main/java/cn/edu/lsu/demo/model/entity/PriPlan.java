package cn.edu.lsu.demo.model.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class PriPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(length = 50, nullable = false)
    private Date createTime;


    @Column(length = 50, nullable = false)
    private Integer sustain;

    @Column(length = 50, nullable = false)
    private String content;


    private Integer userId;
}
